package com.example.smarthome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RoomScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_sreen)
    }

    class RoomScreen : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_room_sreen)


            val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)


            recyclerview.layoutManager = LinearLayoutManager(this)

            val data = ArrayList<ItemsViewModel>()

            for (i in 1..20) {
                data.add(ItemsViewModel(R.drawable.border_edit, "Item " + i))
            }


            val adapter = Adapter(data)


            recyclerview.adapter = adapter

        }
    }
}