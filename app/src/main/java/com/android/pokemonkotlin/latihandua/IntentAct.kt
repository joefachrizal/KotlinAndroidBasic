package com.android.pokemonkotlin.latihandua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.pokemonkotlin.R
import kotlinx.android.synthetic.main.activity_intent.*

class IntentAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        onClicked()
    }

    fun onClicked(){
        btn_move_activity.setOnClickListener {

            val moveWithDataIntent = Intent(this@IntentAct, MoveActivity::class.java)
            moveWithDataIntent.putExtra(MoveActivity.EXTRA_NAME, "Hello Kotlin")
            moveWithDataIntent.putExtra(MoveActivity.EXTRA_AGE, 5)
            startActivity(moveWithDataIntent)
        }
    }

}
