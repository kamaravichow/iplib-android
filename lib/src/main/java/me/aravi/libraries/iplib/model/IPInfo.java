package me.aravi.libraries.iplib.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

@Keep
public class IPInfo {
    @Nullable
    private String IPv4;
    @Nullable
    private String country_code;
    @Nullable
    private String country_name;
    @Nullable
    private String city;
    @Nullable
    private String postal;
    @Nullable
    private String latitude;
    @Nullable
    private String longitude;
    @Nullable
    private String state;

    public IPInfo() {
        // public constructor
    }

    public IPInfo(@Nullable String IPv4, @Nullable String country_code, @Nullable String country_name, @Nullable String city, @Nullable String postal, @Nullable String latitude, @Nullable String longitude, @Nullable String state) {
        this.IPv4 = IPv4;
        this.country_code = country_code;
        this.country_name = country_name;
        this.city = city;
        this.postal = postal;
        this.latitude = latitude;
        this.longitude = longitude;
        this.state = state;
    }

    @Nullable
    public String getIPv4() {
        return IPv4;
    }

    public void setIPv4(@Nullable String IPv4) {
        this.IPv4 = IPv4;
    }

    @Nullable
    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(@Nullable String country_code) {
        this.country_code = country_code;
    }

    @Nullable
    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(@Nullable String country_name) {
        this.country_name = country_name;
    }

    @Nullable
    public String getCity() {
        return city;
    }

    public void setCity(@Nullable String city) {
        this.city = city;
    }

    @Nullable
    public String getPostal() {
        return postal;
    }

    public void setPostal(@Nullable String postal) {
        this.postal = postal;
    }

    @Nullable
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(@Nullable String latitude) {
        this.latitude = latitude;
    }

    @Nullable
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(@Nullable String longitude) {
        this.longitude = longitude;
    }

    @Nullable
    public String getState() {
        return state;
    }

    public void setState(@Nullable String state) {
        this.state = state;
    }
}
