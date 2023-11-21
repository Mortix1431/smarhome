package com.example.smarthome.main_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.example.smarthome.R
import com.example.smarthome.authorization.Auth
import com.example.smarthome.utils.SBobj
import io.github.jan.supabase.gotrue.gotrue
import kotlinx.coroutines.launch

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun back(view: View) {
        startActivity(Intent(this, MainScreen::class.java))
        finish()
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