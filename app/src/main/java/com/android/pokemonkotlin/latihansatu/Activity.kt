package com.android.pokemonkotlin.latihansatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.android.pokemonkotlin.R
import kotlinx.android.synthetic.main.activity_activity.*

class Activity : AppCompatActivity() {

    private lateinit var edtWidth: EditText
    private lateinit var edtHeight: EditText
    private lateinit var edtLength: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, tvResult.text.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)
        edtWidth = edt_width
        edtHeight = edt_height
        edtLength = edt_length
        btnCalculate = btn_calculate
        tvResult = tv_result

        onClick()

        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT) as String
            tvResult.text = result
        }
    }

    fun onClick() {
        btnCalculate.setOnClickListener {
            val inputLength = edtLength.text.toString().trim { it <= ' ' }
            val inputWidth = edtWidth.text.toString().trim { it <= ' ' }
            val inputHeight = edtHeight.text.toString().trim { it <= ' ' }

            var isEmptyFields = false
            var isInvalidDouble = false

            if (TextUtils.isEmpty(inputLength)) {
                isEmptyFields = true
                edtLength.error = getString(R.string.msg_error_empty)
            }

            if (TextUtils.isEmpty(inputWidth)) {
                isEmptyFields = true
                edtWidth.error = getString(R.string.msg_error_empty)
            }

            if (TextUtils.isEmpty(inputHeight)) {
                isEmptyFields = true
                edtHeight.error = getString(R.string.msg_error_empty)
            }

            val length = toDouble(inputLength)
            val width = toDouble(inputWidth)
            val height = toDouble(inputHeight)

            if (length == null) {
                isInvalidDouble = true
                edtLength.error = getString(R.string.msg_error_input_type)
            }
            if (width == null) {
                isInvalidDouble = true
                edtWidth.error = getString(R.string.msg_error_input_type)
            }
            if (height == null) {
                isInvalidDouble = true
                edtHeight.error = getString(R.string.msg_error_input_type)
            }
            if (!isEmptyFields && !isInvalidDouble) {
                val volume = length as Double * width as Double * height as Double
                tvResult.text = volume.toString()
            }
        }
    }

    private fun toDouble(str: String): Double? {
        return try {
            str.toDouble()
        } catch (e: NumberFormatException) {
            null
        }
    }
}
