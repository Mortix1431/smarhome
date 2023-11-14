package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.lifecycle.lifecycleScope
import io.github.jan.supabase.gotrue.gotrue
import io.github.jan.supabase.gotrue.providers.builtin.Email
import kotlinx.coroutines.launch
class Auth : AppCompatActivity() {

    val SB = SBobj.getClient1()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }

    fun login(view: View) {
        val mail = findViewById<EditText>(R.id.email_edit).text.toString()
        val pass = findViewById<EditText>(R.id.pass_edit).text.toString()
        val intentn = Intent(this, LoginCode::class.java)
        lifecycleScope.launch() {
            try{
                SBobj.getClient1().gotrue.loginWith(Email){ Email
                    email = mail
                    password = pass

                }
                startActivity(intentn)
                finish()
            }catch (e:Exception){
                Log.e("AUTH", "Ошибка")
            }
        }
    }

    fun register(view: View) {
        val intentn = Intent(this, Register::class.java)
        startActivity(intentn)
    }
}