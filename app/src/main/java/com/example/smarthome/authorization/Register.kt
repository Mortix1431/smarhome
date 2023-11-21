package com.example.smarthome.authorization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.smarthome.R
import com.example.smarthome.code.CreateCode
import com.example.smarthome.dataClasses.UserInsert
import com.example.smarthome.utils.SBobj
import io.github.jan.supabase.gotrue.gotrue
import io.github.jan.supabase.gotrue.providers.builtin.Email
import kotlinx.coroutines.*
import io.github.jan.supabase.postgrest.postgrest

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun register(view: View) {
        val email_e : String = findViewById<EditText?>(R.id.email_edit).text.toString();
        val username : String = findViewById<EditText?>(R.id.login_edit).text.toString();
        val pass : String = findViewById<EditText?>(R.id.pass_edit).text.toString();
        val emailPattern : Regex = Regex("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")
        if(email_e == "" || username == "" || pass == "" || !email_e.matches(emailPattern) || pass.length < 6){
            Toast.makeText(this, "Проверьте правильность введенных данных!", Toast.LENGTH_SHORT).show()
            return
        }
        val toast: Toast = Toast.makeText(this, "1", Toast.LENGTH_SHORT)
        val code = Intent(this, CreateCode::class.java)
        try {
            lifecycleScope.launch {
                try{
                    SBobj.getClient1().gotrue.signUpWith(Email){
                        email = email_e
                        password = pass
                    }
                }catch (e:Exception) {
                    toast.setText("Данный E-Mail уже зарегестрирован")
                    toast.show()
                    return@launch
                }
                val user = SBobj.getClient1().gotrue.retrieveUserForCurrentSession(false)
                if (user == null) {
                    toast.setText("Произошла ошибка")
                    toast.show()
                    return@launch
                }
                SBobj.getClient1().postgrest["users"].insert(UserInsert(user.id, username, null))
                val sPref = getSharedPreferences("login", MODE_PRIVATE).edit()
                sPref.putString("mail", email_e)
                sPref.putString("pass", pass)
                sPref.apply()
                toast.setText("Аккаунт успешно зарегестрирован")
                toast.show()
                startActivity(code)
            }
        }catch (_: Exception){
            toast.setText("Произошла ошибка")
            toast.show()
        }

    }

    fun LOGIN(view: View) {
        val int = Intent(this, Auth::class.java)
        startActivity(int)
        finish()
    }
}