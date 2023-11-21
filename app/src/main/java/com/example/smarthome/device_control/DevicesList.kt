package com.example.smarthome.device_control

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smarthome.main_activities.MainScreen
import com.example.smarthome.R
import com.example.smarthome.devices.Conder
import com.example.smarthome.devices.Fan
import com.example.smarthome.devices.Hood
import com.example.smarthome.devices.Light
import com.example.smarthome.devices.Tempo

class DevicesList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devices_list)
    }

    fun addD(view: View) {
        val int = Intent(this, AddDevice::class.java)
        startActivity(int)
        finish()

    }
    fun back(view: View) {
        val int = Intent(this, MainScreen::class.java)
        startActivity(int)
        finish()
    }

    fun liight(view: View) {
        val int = Intent(this, Light::class.java)
        startActivity(int)
        finish()
    }

    fun fan(view: View) {
        val int = Intent(this, Fan::class.java)
        startActivity(int)
        finish()
    }
    fun tempo(view: View) {
        val int = Intent(this, Tempo::class.java)
        startActivity(int)
        finish()
    }
    fun condi(view: View) {
        val int = Intent(this, Conder::class.java)
        startActivity(int)
        finish()
    }
    fun hood(view: View) {
        val int = Intent(this, Hood::class.java)
        startActivity(int)
        finish()
    }

}