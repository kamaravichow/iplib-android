package me.aravi.libraries.iplib.model

import retrofit2.http.GET
import me.aravi.libraries.iplib.model.IPInfo
import me.aravi.libraries.iplib.api.Endpoints
import me.aravi.libraries.iplib.api.GeoLocatorAPI
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import androidx.annotation.Keep
import me.aravi.libraries.iplib.listeners.OnIPResponse
import android.os.AsyncTask
import me.aravi.libraries.iplib.IPLib

@Keep
class IPInfo {
    var iPv4: String? = null
    var country_code: String? = null
    var country_name: String? = null
    var city: String? = null
    var postal: String? = null
    var latitude: String? = null
    var longitude: String? = null
    var state: String? = null

    constructor() {
        // public constructor
    }

    constructor(
        IPv4: String?,
        country_code: String?,
        country_name: String?,
        city: String?,
        postal: String?,
        latitude: String?,
        longitude: String?,
        state: String?
    ) {
        iPv4 = IPv4
        this.country_code = country_code
        this.country_name = country_name
        this.city = city
        this.postal = postal
        this.latitude = latitude
        this.longitude = longitude
        this.state = state
    }
}