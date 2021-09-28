package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private val androidList = arrayListOf<ArrayList<String>>(
        arrayListOf("var and val", "Declaring variables.", "Detailed notes here."),
        arrayListOf("User Input", "Getting user input.", "Detailed notes here."),
        arrayListOf(
            "Strings",
            "String concatenations, interpolation, and methods.",
            "Detailed notes here."
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        title = "Android"

        recyclerView = findViewById(R.id.android_recycler_view)
        recyclerViewAdapter = RecyclerViewAdapter(androidList, this)
        recyclerView.adapter = recyclerViewAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}