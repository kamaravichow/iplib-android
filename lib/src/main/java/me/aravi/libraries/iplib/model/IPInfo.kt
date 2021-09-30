package me.aravi.libraries.iplib.model

import androidx.annotation.Keep

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