package me.aravi.libraries.iplib.listeners;

import me.aravi.libraries.iplib.model.IPInfo;

public interface OnIPResponse {

    void onSuccess(IPInfo ipInfo);

    void onError(String message, int errorCode);
}
