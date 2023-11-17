package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.lifecycle.lifecycleScope
import com.example.smarthome.utils.UserMethods
import kotlinx.coroutines.launch

class AddAdress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_adress)
    }

}