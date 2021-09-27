package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_android.*

class AndroidActivity : AppCompatActivity() {

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

        android_recycler_view.adapter = RecyclerViewAdapter(androidList)
        android_recycler_view.layoutManager = LinearLayoutManager(this)
    }
}