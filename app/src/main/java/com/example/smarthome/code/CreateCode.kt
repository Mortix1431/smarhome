package com.example.smarthome.code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.smarthome.other.AddAdress
import com.example.smarthome.R

class CreateCode : AppCompatActivity() {
    var password = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_code)
    }

    fun num_click(view: View) {
            setPassword(view.getTag().toString().toInt())
    }

    fun setPassword(num : Int){
        password += num
        if(password.length == 4){
            val add = Intent(this, AddAdress::class.java)
            val sPref = getSharedPreferences("login", MODE_PRIVATE).edit()
            sPref.putString("code", password)
            sPref.apply()
            startActivity(add)
            finish()
        }
        when(password.length){
            1 -> findViewById<ImageView>(R.id.dot_0).setImageResource(R.drawable.dot_1)
            2 -> findViewById<ImageView>(R.id.dot_1).setImageResource(R.drawable.dot_1)
            3 -> findViewById<ImageView>(R.id.dot_2).setImageResource(R.drawable.dot_1)
            4 -> findViewById<ImageView>(R.id.dot_3).setImageResource(R.drawable.dot_1)
        }
    }
}