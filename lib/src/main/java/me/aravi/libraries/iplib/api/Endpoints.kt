package me.aravi.libraries.iplib.api

import me.aravi.libraries.iplib.model.IPInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Endpoints {
    @GET("json/")
    fun lookup(): Call<IPInfo>

    @GET("json/{ip}")
    fun lookupFor(@Path("ip") ip: String?): Call<IPInfo>
}