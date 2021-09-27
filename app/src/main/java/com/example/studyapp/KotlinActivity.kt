package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

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

        kotlin_recycler_view.adapter = RecyclerViewAdapter(kotlinList, this)
        kotlin_recycler_view.layoutManager = LinearLayoutManager(this)
    }

}