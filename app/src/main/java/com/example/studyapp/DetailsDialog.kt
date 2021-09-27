package com.example.studyapp

import android.app.Activity
import android.app.AlertDialog
import android.widget.Button
import android.view.LayoutInflater
import android.widget.TextView


class DetailsDialog(title: String, desc: String, activity: Activity) {
    init {
        val dialogBuilder = AlertDialog.Builder(activity,R.style.details_dialog)
        val dialogView = LayoutInflater.from(activity).inflate(R.layout.details_dialog,null)
        val  titleView = dialogView.findViewById<TextView>(R.id.title_dialog)
        val descView = dialogView.findViewById<TextView>(R.id.desc_dialog)
        titleView.text = title
        descView.text = desc
        dialogBuilder.setView(dialogView)
        dialogBuilder.show()
    }
}