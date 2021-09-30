package me.aravi.libraries.iplib.listeners

import me.aravi.libraries.iplib.model.IPInfo

interface OnIPResponse {
    fun onSuccess(ipInfo: IPInfo?)
    fun onError(message: String?, errorCode: Int)
}