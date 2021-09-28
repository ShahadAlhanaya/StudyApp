package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private val kotlinList = arrayListOf<ArrayList<String>>(
        arrayListOf("var and val", "Declaring variables.", "Detailed notes here."),
        arrayListOf("User Input", "Getting user input.", "Detailed notes here."),
        arrayListOf("Strings", "String concatenations, interpolation, and methods.", "Detailed notes here."
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        title = "Kotlin"

        recyclerView = findViewById(R.id.kotlin_recycler_view)
        recyclerViewAdapter = RecyclerViewAdapter(kotlinList, this)
        recyclerView.adapter = recyclerViewAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}