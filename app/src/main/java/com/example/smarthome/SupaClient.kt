package com.example.smarthome

import android.net.http.HttpResponseCache.install
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.GoTrue
import io.github.jan.supabase.postgrest.Postgrest

class SupaClient {

    private val client = createSupabaseClient(
        supabaseUrl = "dsfdsfdsfdfssddsf.supabse.co",

        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImlxemJia2FtaGVwZGJsbGd6YnBxIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTk2MDM4NDMsImV4cCI6MjAxNTE3OTg0M30.nON-vzAWMiY4dh_u3DhXkgVqoDd5TRMlvsDADpMrkZc"
    ) {
        install(GoTrue)
        install(Postgrest)
        //install other modules
    }
    fun getClient() : SupabaseClient {
        return this.client

        return createSupabaseClient(
            supabaseUrl = "https://iqzbbkamhepdbllgzbpq.supabase.co",
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImlxemJia2FtaGVwZGJsbGd6YnBxIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTk2MDM4NDMsImV4cCI6MjAxNTE3OTg0M30.nON-vzAWMiY4dh_u3DhXkgVqoDd5TRMlvsDADpMrkZc"
        ) {
            install(GoTrue)
            install(Postgrest)
            //install other modules
        }

    }

}
