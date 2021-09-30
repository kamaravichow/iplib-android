package me.aravi.libraries.iplib;

import android.os.AsyncTask;

import me.aravi.libraries.iplib.api.GeoLocatorAPI;
import me.aravi.libraries.iplib.listeners.OnIPResponse;
import me.aravi.libraries.iplib.model.IPInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IPLib {
    private static IPLib instance;

    /**
     * Creates a new instance of iplib
     *
     * @return
     */
    public static IPLib getInstance() {
        if (instance == null) {
            instance = new IPLib();
        }
        return instance;
    }

    private IPLib() {
    }

    /**
     * GeoLocator api call happens here
     * NOTE : THIS RUNS ON MAIN THREAD
     *
     * @param listener
     */
    public void ipLookup(OnIPResponse listener) {
        Call<IPInfo> lookup = GeoLocatorAPI.getInstance().getService().lookup();
        lookup.enqueue(new Callback<IPInfo>() {
            @Override
            public void onResponse(Call<IPInfo> call, Response<IPInfo> response) {
                if (response.isSuccessful()) {
                    listener.onSuccess(response.body());
                } else {
                    listener.onError(response.message(), response.code());
                }
            }

            @Override
            public void onFailure(Call<IPInfo> call, Throwable t) {
                listener.onError(t.getMessage(), 1024);
            }
        });
    }


    /**
     * Ip Lookup with Ip Address
     *
     * @param ipAddress
     * @param listener
     */
    public void ipLookupWith(String ipAddress, OnIPResponse listener) {
        Call<IPInfo> lookup = GeoLocatorAPI.getInstance().getService().lookupFor(ipAddress);
        lookup.enqueue(new Callback<IPInfo>() {
            @Override
            public void onResponse(Call<IPInfo> call, Response<IPInfo> response) {
                if (response.isSuccessful()) {
                    listener.onSuccess(response.body());
                } else {
                    listener.onError(response.message(), response.code());
                }
            }

            @Override
            public void onFailure(Call<IPInfo> call, Throwable t) {
                listener.onError(t.getMessage(), 1024);
            }
        });
    }


    /**
     * This is same as the other method
     * this happens in async thread
     *
     * @param listener
     */
    public void ipLookupAsync(OnIPResponse listener) {
        AsyncTask.execute(() -> {
            ipLookup(listener);
        });
    }

    /**
     * @param ipAddress
     * @param listener
     */
    public void ipLookupWithIpAsync(String ipAddress, OnIPResponse listener) {
        AsyncTask.execute(() -> {
            ipLookupWith(ipAddress, listener);
        });
    }


}
