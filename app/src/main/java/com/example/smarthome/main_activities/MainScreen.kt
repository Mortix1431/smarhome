package com.example.smarthome.main_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smarthome.other.AddRoom
import com.example.smarthome.R
import com.example.smarthome.device_control.DevicesList

class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }

    fun setting(view: View) {
        val int = Intent(this, Profile::class.java)
        startActivity(int)
        finish()
    }

    fun addR(view: View) {
        val intent = Intent(this, AddRoom::class.java)
        startActivity(intent)
        finish()
    }

    fun gostin(view: View) {
        val int = Intent(this, DevicesList::class.java)
        startActivity(int)
        finish()
    }


}