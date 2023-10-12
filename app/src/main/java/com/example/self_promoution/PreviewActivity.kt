package com.example.self_promoution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_preview.text_view_message

class PreviewActivity : AppCompatActivity() {

    private var textViewMessage: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val contactName = intent.getStringExtra("contactName")
        val contactNumber = intent.getStringExtra("contactNumber")
        val myDisplayName = intent.getStringExtra("myDisplayName")
        val junior = intent.getBooleanExtra("junior", false)
        val jobTitle = intent.getStringExtra("jobTitle")
        val immediateStart = intent.getBooleanExtra("immediateStart", false)
        val startDate = intent.getStringExtra("startDate")

        val testString = "Contact Name: $contactName,\n Contact Number: $contactNumber,\n" +
                "My Display Name: $myDisplayName\n, Include Junior: $junior,\n" +
                "Job Title: $jobTitle\n, Immediate Start: $immediateStart,\n" +
                "Start Date: $startDate\n"

        text_view_message.text = testString
    }
}