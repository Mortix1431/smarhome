package com.example.smarthome.devices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.smarthome.R
import com.example.smarthome.device_control.DevicesList
import com.google.android.material.slider.Slider

class Fan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fan)
        val slider = findViewById<Slider>(R.id.slider)
        val value_text = findViewById<TextView>(R.id.value_name)
        slider.addOnChangeListener(Slider.OnChangeListener{ sliderr, value, fromUser -> value_text.text = value.toInt().toString()+"% мощность"})
    }
    fun back(view: View) {
        startActivity(Intent(this, DevicesList::class.java))
        finish()
    }
}