package com.android.pokemonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class HalamanUtama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)
    }

    fun onLatihan1(view: View) {
        Toast.makeText(this, "kamu milih akuu", Toast.LENGTH_SHORT).show()
    }

    fun onLatihan2(view: View) {
        Toast.makeText(this, "kamu milih akuu", Toast.LENGTH_SHORT).show()
    }

    fun onLatihan3(view: View) {
        Toast.makeText(this, "kamu milih akuu", Toast.LENGTH_SHORT).show()
    }

    fun onLatihan4(view: View) {
        Toast.makeText(this, "kamu milih akuu", Toast.LENGTH_SHORT).show()
    }
}
