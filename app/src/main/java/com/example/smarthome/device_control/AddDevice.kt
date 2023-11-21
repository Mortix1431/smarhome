package com.example.smarthome.device_control

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import com.example.smarthome.R

class AddDevice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_device)
        findViewById<ImageButton>(R.id.light).background =
            AppCompatResources.getDrawable(this, R.drawable.active_btn)
    }

    fun back(view: View) {
        val int = Intent(this, DevicesList::class.java)
        startActivity(int)
        finish()
    }

    fun sohran(view: View) {
        val int = Intent(this, DevicesList::class.java)
        val name = findViewById<EditText>(R.id.edit_dv_name).text.toString()
        val id = findViewById<EditText>(R.id.edit_dv_id).text.toString()
        if (id == "") {
            Toast.makeText(
                applicationContext,
                "Введите идентификатор устройства!",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

    }

    fun type(view: View) {
        val tag = view.getTag().toString()
        if (tag == "light") {
            findViewById<ImageButton>(R.id.light).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<ImageButton>(R.id.condi).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.hood).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.thermo).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.fan).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<TextView>(R.id.light_t).setTextColor(getColor(R.color.bluebut))
            findViewById<TextView>(R.id.hood_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.thermo_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.condi_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.fan_t).setTextColor(getColor(R.color.gray))
        } else if (tag == "hood") {
            findViewById<ImageButton>(R.id.light).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.hood).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<ImageButton>(R.id.thermo).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.fan).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.condi).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<TextView>(R.id.light_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.hood_t).setTextColor(getColor(R.color.bluebut))
            findViewById<TextView>(R.id.thermo_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.condi_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.fan_t).setTextColor(getColor(R.color.gray))
        } else if (tag == "thermo") {
            findViewById<ImageButton>(R.id.light).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.condi).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.hood).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.thermo).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<ImageButton>(R.id.fan).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<TextView>(R.id.light_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.hood_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.thermo_t).setTextColor(getColor(R.color.bluebut))
            findViewById<TextView>(R.id.condi_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.fan_t).setTextColor(getColor(R.color.gray))
        } else if (tag == "fan") {
            findViewById<ImageButton>(R.id.light).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.condi).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.hood).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.thermo).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.fan).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<TextView>(R.id.light_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.hood_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.thermo_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.condi_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.fan_t).setTextColor(getColor(R.color.bluebut))
        } else if (tag == "condi") {
            findViewById<ImageButton>(R.id.light).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.condi).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<ImageButton>(R.id.hood).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.thermo).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.fan).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<TextView>(R.id.light_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.hood_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.thermo_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.condi_t).setTextColor(getColor(R.color.bluebut))
            findViewById<TextView>(R.id.fan_t).setTextColor(getColor(R.color.gray))
        }
    }
}