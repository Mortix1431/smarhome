package com.example.smarthome.other

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import com.example.smarthome.R
import com.example.smarthome.main_activities.MainScreen

class AddRoom : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_room)
        findViewById<ImageButton>(R.id.living).background =
            AppCompatResources.getDrawable(this, R.drawable.active_btn)
    }

    fun back(view: View) {
        val int = Intent(this, MainScreen::class.java)
        startActivity(int)
        finish()
    }

    fun sohran(view: View) {
        val int = Intent(this, MainScreen::class.java)
        startActivity(int)
        finish()
    }

    fun type(view: View) {
        val tag = view.getTag().toString()
        if (tag == "living") {
            findViewById<ImageButton>(R.id.living).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<ImageButton>(R.id.kitchen).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bathroom).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.cabinet).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bed).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.zal).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<TextView>(R.id.living_t).setTextColor(getColor(R.color.bluebut))
            findViewById<TextView>(R.id.bathroom_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.cabinet_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.kitchen_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bed_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.zal_t).setTextColor(getColor(R.color.gray))
        } else if (tag == "bathroom") {
            findViewById<ImageButton>(R.id.living).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bathroom).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<ImageButton>(R.id.cabinet).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bed).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.kitchen).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.zal).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<TextView>(R.id.living_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bathroom_t).setTextColor(getColor(R.color.bluebut))
            findViewById<TextView>(R.id.cabinet_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.kitchen_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bed_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.zal_t).setTextColor(getColor(R.color.gray))
        } else if (tag == "cabinet") {
            findViewById<ImageButton>(R.id.living).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.kitchen).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bathroom).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.cabinet).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<ImageButton>(R.id.bed).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.zal).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<TextView>(R.id.living_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bathroom_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.cabinet_t).setTextColor(getColor(R.color.bluebut))
            findViewById<TextView>(R.id.kitchen_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bed_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.zal_t).setTextColor(getColor(R.color.gray))
        } else if (tag == "bed") {
            findViewById<ImageButton>(R.id.living).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.kitchen).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bathroom).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.cabinet).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bed).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<ImageButton>(R.id.zal).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<TextView>(R.id.living_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bathroom_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.cabinet_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.kitchen_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bed_t).setTextColor(getColor(R.color.bluebut))
            findViewById<TextView>(R.id.zal_t).setTextColor(getColor(R.color.gray))
        } else if (tag == "kitchen") {
            findViewById<ImageButton>(R.id.living).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.kitchen).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<ImageButton>(R.id.bathroom).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.cabinet).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bed).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.zal).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<TextView>(R.id.living_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bathroom_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.cabinet_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.kitchen_t).setTextColor(getColor(R.color.bluebut))
            findViewById<TextView>(R.id.bed_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.zal_t).setTextColor(getColor(R.color.gray))
        } else if (tag == "zal") {
            findViewById<ImageButton>(R.id.living).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.kitchen).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bathroom).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.cabinet).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.bed).background =
                AppCompatResources.getDrawable(this, R.drawable.unactive_btn)
            findViewById<ImageButton>(R.id.zal).background =
                AppCompatResources.getDrawable(this, R.drawable.active_btn)
            findViewById<TextView>(R.id.living_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bathroom_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.cabinet_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.kitchen_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.bed_t).setTextColor(getColor(R.color.gray))
            findViewById<TextView>(R.id.zal_t).setTextColor(getColor(R.color.bluebut))
        }
    }
}




