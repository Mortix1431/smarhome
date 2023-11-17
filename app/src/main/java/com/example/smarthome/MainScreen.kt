package com.example.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.room_adapter
import com.example.smarthome.dataClasses.RoomList
import com.example.smarthome.utils.SBobj
import com.example.smarthome.utils.UserMethods
import io.github.jan.supabase.postgrest.postgrest
import io.github.jan.supabase.postgrest.query.Columns
import io.github.jan.supabase.storage.storage
import kotlinx.coroutines.launch
import org.json.JSONArray
import org.json.JSONObject
import java.lang.StringBuilder

class MainScreen : AppCompatActivity() {

    var roomItems: ArrayList<RoomList> = ArrayList<RoomList>()
    var room_array: JSONArray = JSONArray()
    var rooms: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        rooms = findViewById<RecyclerView>(R.id.list)
        rooms!!.layoutManager = GridLayoutManager(this, GridLayoutManager.VERTICAL)

    }

    fun setting(view: View) {
        val int = Intent(this, Profile::class.java)
        startActivity(int)
        finish()
    }

    private fun addItemsFromJSON(){
        try{
            lifecycleScope.launch {
                for (i in 0..<room_array.length()) {
                    var itemObj: JSONObject = room_array.getJSONObject(i)
                    var testType = itemObj.getJSONObject("r_types")
                    Log.e("", testType.toString())
                    var img = SBobj.getClient1().storage["test1"].downloadPublic(testType.getString("image"))
                    var name : String
                    if(itemObj.getString("name") == "null")
                        name = testType.getString("base_name")
                    else
                        name = itemObj.getString("name")
                    var catalog: RoomList = RoomList(
                        name,
                        img,
                        itemObj.getInt("rome_id")
                        )
                    roomItems += catalog
                }
                val adapter = room_adapter(roomItems, room_adapter.OnClickListener{ room -> goRoom(room.id)})
                rooms!!.adapter = adapter

                adapter.notifyDataSetChanged()
            }
        } catch (e: Exception){
            Log.e("ERROE", e.toString())
        }
    }

    fun goRoom(room_id : Int){
        val int = Intent(this, DevicesList::class.java)
        startActivity(int)
    }

    fun addR(view: View) {
        val intent = Intent(this, AddRoom::class.java)
        startActivity(intent)
        finish()
    }


}