package com.example.smarthome.other

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.smarthome.R
import com.example.smarthome.authorization.Auth
import com.example.smarthome.code.LoginCode
import com.example.smarthome.utils.SBobj
import io.github.jan.supabase.gotrue.gotrue
import io.github.jan.supabase.gotrue.providers.builtin.Email
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        val sPref = getSharedPreferences("login", MODE_PRIVATE)
        val MainA = Intent(applicationContext, LoginCode::class.java)
        val mail : String? = sPref.getString("mail", "")
        val pass : String? = sPref.getString("pass", "")
        val tost = Toast.makeText(this, "1", Toast.LENGTH_SHORT)
        if (mail != "") {
            lifecycleScope.launch {
                try{
                    SBobj.getClient1().gotrue.loginWith(Email){
                        email = mail!!
                        password = pass!!
                    }
                    startActivity(MainA)
                    finish()
                }catch (e:Exception){
                    tost.setText("Нет соединения с сервером, попробуйте позже")
                    tost.show()
                }
            }
        }else{
            val timer = object: CountDownTimer(3000, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    val MainB = Intent(applicationContext, Auth::class.java)
                    startActivity(MainB)
                    finish()
                }
            }
            timer.start()
        }
    }
}