package com.example.ejercicio_cuatro

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edCadena: EditText
    lateinit var chkNegrita: CheckBox
    lateinit var chkCursiva: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edCadena = findViewById(R.id.edCadena)
        chkCursiva = findViewById(R.id.chkCursiva)
        chkNegrita = findViewById(R.id.chkNegrita)
    }

    fun verificaCheck(view: View) {

        edCadena.typeface = Typeface.DEFAULT

        if (chkCursiva.isChecked) {
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
        } else if (chkNegrita.isChecked) {
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
        }
        if (chkCursiva.isChecked && chkNegrita.isChecked) {
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
        }

    }
}