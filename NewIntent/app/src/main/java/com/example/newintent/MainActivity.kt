package com.example.newintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurando o Botão OK
        btnOK.setOnClickListener(View.OnClickListener {
            // criando e vinculando variáveis
            val url=edtURL.text.toString()
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }) // fim do btnOK.OnClickListener
    } // fim onCreate

} // fim da classe
