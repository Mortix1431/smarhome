package com.example.smarthome.code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.smarthome.other.AddAdress
import com.example.smarthome.authorization.Auth
import com.example.smarthome.R
import com.example.smarthome.utils.SBobj
import io.github.jan.supabase.gotrue.gotrue
import kotlinx.coroutines.launch

class LoginCode : AppCompatActivity() {

    var password = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_code)
    }



    fun num_click(view: View) {
        setPassword(view.getTag().toString().toInt())
    }

    fun setPassword(num : Int){
        password += num
        when(password.length){
            1 -> findViewById<ImageView>(R.id.dot_0).setImageResource(R.drawable.dot_1)
            2 -> findViewById<ImageView>(R.id.dot_1).setImageResource(R.drawable.dot_1)
            3 -> findViewById<ImageView>(R.id.dot_2).setImageResource(R.drawable.dot_1)
            4 -> findViewById<ImageView>(R.id.dot_3).setImageResource(R.drawable.dot_1)
        }
        if(password.length == 4){
            val sPref = getSharedPreferences("login", MODE_PRIVATE)
            val add = Intent(this, AddAdress::class.java)
            if(sPref.getString("code", "") == password) {
                startActivity(add)
                finish()
            }else{
                Toast.makeText(this, "Неправильный код", Toast.LENGTH_SHORT).show()
                password = ""
                findViewById<ImageView>(R.id.dot_0).setImageResource(R.drawable.dot_0)
                findViewById<ImageView>(R.id.dot_1).setImageResource(R.drawable.dot_0)
                findViewById<ImageView>(R.id.dot_2).setImageResource(R.drawable.dot_0)
                findViewById<ImageView>(R.id.dot_3).setImageResource(R.drawable.dot_0)
            }
        }
    }

    fun exit(view: View) {
        val int = Intent(this, Auth::class.java)
        lifecycleScope.launch {
            SBobj.getClient1().gotrue.logout()
            val sPref = getSharedPreferences("login", MODE_PRIVATE).edit()
            sPref.remove("mail")
            sPref.remove("pass")
            sPref.remove("code")
            sPref.apply()
            startActivity(int)
            finish()
        }
    }
}