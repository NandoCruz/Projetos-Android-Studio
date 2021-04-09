package com.example.calculandoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        peso = (EditText) findViewById (R.id.edtPeso);
        altura = (EditText) findViewById (R.id..edtAltura);
        imc = (Button) findViewById (R.id.btnIMC);

        imc.setOnClickListener

    }
}
