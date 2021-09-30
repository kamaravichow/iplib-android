package me.aravi.libraries.iplib.api;

import me.aravi.libraries.iplib.model.IPInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface Endpoints {
    @GET("json/")
    Call<IPInfo> lookup();

    @GET("json/{ip}")
    Call<IPInfo> lookupFor(@Path("ip") String ip);
}
