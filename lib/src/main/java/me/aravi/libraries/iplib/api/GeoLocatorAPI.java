package me.aravi.libraries.iplib.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GeoLocatorAPI {
    private static final String TAG = GeoLocatorAPI.class.getSimpleName();
    public static final String url = "https://geolocation-db.com/";
    public static Endpoints apiService = null;
    private static GeoLocatorAPI instance;


    public static GeoLocatorAPI getInstance() {
        if (instance == null) {
            instance = new GeoLocatorAPI();
        }
        instance.getService();
        return instance;
    }

    private GeoLocatorAPI() {
    }

    public Endpoints getService() {
        if (apiService == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            apiService = retrofit.create(Endpoints.class);

        }
        return apiService;
    }


}
