package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.lifecycleScope
import com.example.smarthome.utils.UserMethods
import kotlinx.coroutines.launch

class AddRoom : AppCompatActivity() {

    var select_type = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_room)
        findViewById<ImageButton>(R.id.living).background = AppCompatResources.getDrawable(this,R.drawable.active_btn)
    }

    fun back(view: View) {
        val int = Intent(this, MainScreen::class.java)
        startActivity(int)
        finish()
    }
    fun sohran (view: View) {
        val int = Intent(this, MainScreen::class.java)
            startActivity(int)
            finish()
        }
    }


