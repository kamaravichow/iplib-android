package me.aravi.ip.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.aravi.libraries.iplib.IPLib
import me.aravi.libraries.iplib.listeners.OnIPResponse
import me.aravi.libraries.iplib.model.IPInfo

class KotlinActivity : AppCompatActivity() {

    private lateinit var ipLib: IPLib


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        ipLib = IPLib.instance!!


        ipLib.ipLookup(object : OnIPResponse {
            override fun onSuccess(ipInfo: IPInfo?) {
                TODO("Not yet implemented")
            }

            override fun onError(message: String?, errorCode: Int) {
                TODO("Not yet implemented")
            }
        })


        ipLib.ipLookupWithIpAsync("IP_ADDRESS", object : OnIPResponse {
            override fun onSuccess(ipInfo: IPInfo?) {
                TODO("Not yet implemented")
            }

            override fun onError(message: String?, errorCode: Int) {
                TODO("Not yet implemented")
            }
        })


    }
}