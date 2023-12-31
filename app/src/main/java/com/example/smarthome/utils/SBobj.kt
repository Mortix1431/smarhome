package com.example.smarthome.utils

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.GoTrue
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.storage.Storage

object SBobj {
    private var client = createSupabaseClient(
        supabaseUrl = "https://iqzbbkamhepdbllgzbpq.supabase.co",

        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImlxemJia2FtaGVwZGJsbGd6YnBxIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTk2MDM4NDMsImV4cCI6MjAxNTE3OTg0M30.nON-vzAWMiY4dh_u3DhXkgVqoDd5TRMlvsDADpMrkZc"
    ) {
        install(GoTrue)
        install(Postgrest)
        install(Storage)

    }

    var selected_room = 0
    var selected_device = 0
    fun getClient1(): SupabaseClient {
        return client
    }
    fun getClient() : SupabaseClient {
        return client


    }

}