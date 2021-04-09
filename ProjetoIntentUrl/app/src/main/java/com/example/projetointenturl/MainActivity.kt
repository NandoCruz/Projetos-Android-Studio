package com.example.projetointenturl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOK.setOnClickListener(View.OnClickListener {
            val url=edtURL.text.toString()

            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))

            startActivity(intent)
        })

    }
}
