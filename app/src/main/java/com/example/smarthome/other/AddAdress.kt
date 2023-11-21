package com.example.smarthome.other

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.smarthome.R
import com.example.smarthome.main_activities.MainScreen

class AddAdress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_adress)
    }

    fun save(view: View) {
        val adr = findViewById<EditText>(R.id.edit_adress).text.toString()
        val int = Intent(this, MainScreen::class.java)
        val adressPattern : Regex = Regex("г\\. +[А-я]+, ул\\. +[А-я]+, д\\. +[0-9]+")
        if(adressPattern.matches(adr)){
            startActivity(int)
            finish()
        }else
            Toast.makeText(applicationContext, "Проверьте правильность введенного адреса!", Toast.LENGTH_SHORT).show()
    }

}