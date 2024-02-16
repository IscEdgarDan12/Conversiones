package com.example.conversiones

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtDolar: EditText = findViewById(R.id.txtDolar)
        val txtPesosMx: EditText = findViewById(R.id.txtPesoMx)
        val btnDolar: Button = findViewById(R.id.btnDolar)

        val txtDistancia: EditText = findViewById(R.id.txtDistancia)
        val txtMetros: EditText = findViewById(R.id.txtMetros)
        val btnDistancia: Button = findViewById(R.id.btnDistancia)

        val txtConPeso: EditText = findViewById(R.id.txtConPeso)
        val txtKilos: EditText = findViewById(R.id.txtKilos)
        val btnConPeso: Button = findViewById(R.id.btnConPeso)

        btnDolar.setOnClickListener {
            val dolar = txtDolar.text.toString()
            if (dolar.isEmpty()) {
                Toast.makeText(this, "Debes introducir un valor en dólares", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val numP: Double = dolar.toDouble() * 17.85
                txtPesosMx.setText(numP.toString())
                Toast.makeText(
                    this,
                    "Se hizo la conversión de dólares a pesos $$$",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        btnDistancia.setOnClickListener {
            val pies = txtDistancia.text.toString()
            if (pies.isEmpty()) {
                Toast.makeText(this, "Debes introducir un valor en pies", Toast.LENGTH_SHORT).show()
            } else {
                val numMetros: Double = pies.toDouble() * 0.3048
                txtMetros.setText(numMetros.toString())
                Toast.makeText(this, "Se hizo la conversión de pies a metros", Toast.LENGTH_LONG)
                    .show()
            }
        }
        btnConPeso.setOnClickListener {
            val libras = txtConPeso.text.toString()
            if (libras.isEmpty()) {
                Toast.makeText(this, "Debes introducir un valor en libras", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val numKilos: Double = libras.toDouble() * 0.45359237
                txtKilos.setText(numKilos.toString())
                Toast.makeText(this, "Se hizo la conversión de libras a kilos", Toast.LENGTH_LONG)
                    .show()
            }

            val ventana: Button = findViewById(R.id.ventana)
            ventana.setOnClickListener {
                val miIntent = Intent(this, Volteable::class.java)
                startActivity(miIntent)
            }
        }
    }
}
