package com.example.self_promoution

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.check_box_immediate_start
import kotlinx.android.synthetic.main.activity_main.check_box_junior
import kotlinx.android.synthetic.main.activity_main.edit_my_display_name
import kotlinx.android.synthetic.main.activity_main.edit_text_contact_name
import kotlinx.android.synthetic.main.activity_main.edit_text_contact_number
import kotlinx.android.synthetic.main.activity_main.edit_text_start_date
import kotlinx.android.synthetic.main.activity_main.spinner_job_title

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val previewButton = findViewById<Button>(R.id.button_preview)

        previewButton.setOnClickListener {
            onPreviewClicked()
        }
    }

    private fun onPreviewClicked() {

        val contactName = edit_text_contact_name.text.toString()
        val contactNumber = edit_text_contact_number.text.toString()
        val myDisplayName = edit_my_display_name.text.toString()
        val junior = check_box_junior.isChecked
        val jobTitle = spinner_job_title.selectedItem?.toString()
        val immediateStart = check_box_immediate_start.isChecked
        val startDate = edit_text_start_date.text.toString()

        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        previewActivityIntent.putExtra("contactName", contactName)
        previewActivityIntent.putExtra("contactNumber", contactNumber)
        previewActivityIntent.putExtra("myDisplayName", myDisplayName)
        previewActivityIntent.putExtra("junior", junior)
        previewActivityIntent.putExtra("jobTitle", jobTitle)
        previewActivityIntent.putExtra("immediateStart", immediateStart)
        previewActivityIntent.putExtra("startDate", startDate)

        startActivity(previewActivityIntent)
    }

}