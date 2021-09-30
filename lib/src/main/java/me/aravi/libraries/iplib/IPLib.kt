package me.aravi.libraries.iplib

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.aravi.libraries.iplib.api.GeoLocatorAPI
import me.aravi.libraries.iplib.listeners.OnIPResponse
import me.aravi.libraries.iplib.model.IPInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class IPLib private constructor() {
    /**
     * GeoLocator api call happens here
     * NOTE : THIS RUNS ON MAIN THREAD
     *
     * @param listener
     */
    fun ipLookup(listener: OnIPResponse) {
        val lookup: Call<IPInfo> = GeoLocatorAPI.apiService!!.lookup()
        lookup.enqueue(object : Callback<IPInfo?> {
            override fun onResponse(call: Call<IPInfo?>, response: Response<IPInfo?>) {
                if (response.isSuccessful) {
                    listener.onSuccess(response.body())
                } else {
                    listener.onError(response.message(), response.code())
                }
            }

            override fun onFailure(call: Call<IPInfo?>, t: Throwable) {
                listener.onError(t.message, 1024)
            }
        })
    }

    /**
     * Ip Lookup with Ip Address
     *
     * @param ipAddress
     * @param listener
     */
    fun ipLookupWith(ipAddress: String?, listener: OnIPResponse) {
        val lookup: Call<IPInfo> = GeoLocatorAPI.apiService!!.lookupFor(ipAddress)
        lookup.enqueue(object : Callback<IPInfo?> {
            override fun onResponse(call: Call<IPInfo?>, response: Response<IPInfo?>) {
                if (response.isSuccessful) {
                    listener.onSuccess(response.body())
                } else {
                    listener.onError(response.message(), response.code())
                }
            }

            override fun onFailure(call: Call<IPInfo?>, t: Throwable) {
                listener.onError(t.message, 1024)
            }
        })
    }

    /**
     * This is same as the other method
     * this happens in async thread
     *
     * @param listener
     */
    fun ipLookupAsync(listener: OnIPResponse) {
        CoroutineScope(Dispatchers.IO).launch {
            ipLookup(listener)
        }
    }

    /**
     * @param ipAddress
     * @param listener
     */
    fun ipLookupWithIpAsync(ipAddress: String?, listener: OnIPResponse) {
        CoroutineScope(Dispatchers.IO).launch {
            ipLookupWith(ipAddress, listener)
        }
    }

    companion object {
        /**
         * Creates a new instance of iplib
         *
         * @return
         */
        @JvmStatic
        var instance: IPLib? = null
            get() {
                if (field == null) {
                    field = IPLib()
                }
                return field
            }
            private set
    }
}