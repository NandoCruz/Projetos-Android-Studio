package com.example.alertadialogo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alertDialog = AlertDialog.Builder(this@MainActivity).create()
        alertDialog.setTitle("Fernando Cruz")
        alertDialog.setMessage("Entre na sua URL preferida agora.")
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", {
            dialogInterface, i ->
            Toast.makeText(applicationContext, "você clicou OK", Toast.LENGTH_SHORT).show()
        })

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "CANCELAR",{
            dialogInterface, j ->
            Toast.makeText(applicationContext, "você clicou CANCELAR", Toast.LENGTH_SHORT).show()
        })
        alertDialog.show()

        btnOk.setOnClickListener(View.OnClickListener {
            val url = edtTexto.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        })
    }
}