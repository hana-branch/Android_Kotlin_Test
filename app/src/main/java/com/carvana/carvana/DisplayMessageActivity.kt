package com.carvana.carvana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.carvana.carvana.R

import io.branch.referral.util.BranchEvent

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }

        BranchEvent("Some Custom Event")
            .addCustomDataProperty("Custom_Event_Property_Key11", "Custom_Event_Property_val11")
            .addCustomDataProperty("Custom_Event_Property_Key22", "Custom_Event_Property_val22")
            .setCustomerEventAlias("my_custom_alias")
            .logEvent(this);
    }




}
