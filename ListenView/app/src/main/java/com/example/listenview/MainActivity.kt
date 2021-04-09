package com.example.listenview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    } // Fim do onCreate

    // Criando ListenView
    fun main(args: Array<String>) {

        var myArrayList = ArrayList<String>()
        myArrayList.add("Mercedes")
        myArrayList.add("Ferrari")
        myArrayList.add("Willian")
        myArrayList.add("Red Bull")
        myArrayList.add("MacLaren")
        myArrayList.add("Lotus")
        myArrayList.add("Force India")
        return;

        for (i in myArrayList) {
            println(i)
        }// fim for
    } // fim função Array

} // Fim da Classe
