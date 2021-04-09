package com.example.passandoparametros

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_segunda.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ok = findViewById<Button> (R.id.btnNova) as Button;
        ok.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(applicationContext, SegundaActivity::class.java)
        val params = Bundle()
        val textoDigitado = edtNome.text.toString()
        params.putString("texto", textoDigitado)
        intent.putExtras(params)
        startActivity(intent)
    }
}
