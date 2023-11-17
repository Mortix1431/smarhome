package com.example.smarthome.utils

import io.github.jan.supabase.gotrue.gotrue
import io.github.jan.supabase.gotrue.providers.builtin.Email

class UserMethods {

    suspend fun Auth(mail : String, pass : String) : Boolean{
        try {
            SBobj.getClient1().gotrue.loginWith(Email) {
                email = mail
                password = pass
            }
            return true
        }catch (_:Exception){
            return false
        }
    }

    suspend fun SignUp(mail : String, pass : String) : Boolean{
        try {
            SBobj.getClient1().gotrue.signUpWith(Email) {
                email = mail
                password = pass
            }
            return true
        }catch (_:Exception){
            return false
        }
    }


}