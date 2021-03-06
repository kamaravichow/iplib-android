package me.aravi.libraries.iplib.api

import com.google.gson.GsonBuilder
import me.aravi.libraries.iplib.api.GeoLocatorAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GeoLocatorAPI private constructor() {
    val service: Endpoints?
        get() {
            if (apiService == null) {
                val gson = GsonBuilder()
                    .setLenient()
                    .create()
                val retrofit = Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
                apiService = retrofit.create(Endpoints::class.java)
            }
            return apiService
        }

    companion object {
        private val TAG = GeoLocatorAPI::class.java.simpleName
        const val url = "https://geolocation-db.com/"
        var apiService: Endpoints? = null
        var instance: GeoLocatorAPI? = null
            get() {
                if (field == null) {
                    field = GeoLocatorAPI()
                }
                field!!.service
                return field
            }
            private set
    }
}