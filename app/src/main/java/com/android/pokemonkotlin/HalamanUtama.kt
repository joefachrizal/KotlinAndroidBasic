package com.android.pokemonkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.android.pokemonkotlin.latihandua.IntentAct
import com.android.pokemonkotlin.latihanempat.RecyclerAct
import com.android.pokemonkotlin.latihansatu.Activity
import com.android.pokemonkotlin.latihantiga.ViewGroup

class HalamanUtama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)
    }

    fun onLatihan1(view: View) {
        Toast.makeText(this, "kamu milih akuu", Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(this@HalamanUtama, Activity::class.java)
        startActivity(moveWithDataIntent)
    }

    fun onLatihan2(view: View) {
        Toast.makeText(this, "kamu milih akuu", Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(this@HalamanUtama, IntentAct::class.java)
        startActivity(moveWithDataIntent)
    }

    fun onLatihan3(view: View) {
        Toast.makeText(this, "kamu milih akuu", Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(this@HalamanUtama, ViewGroup::class.java)
        startActivity(moveWithDataIntent)
    }

    fun onLatihan4(view: View) {
        Toast.makeText(this, "kamu milih akuu", Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(this@HalamanUtama, RecyclerAct::class.java)
        startActivity(moveWithDataIntent)
    }
}
