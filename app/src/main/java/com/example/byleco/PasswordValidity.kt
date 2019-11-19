package com.example.byleco

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

fun passwordValidity (editTextPass: EditText, textViewPassWarn: TextView){
    editTextPass.addTextChangedListener(object: TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            if (editTextPass.length() == 0){
                textViewPassWarn.visibility = TextView.INVISIBLE
            }
        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            if (editTextPass.length() < 6){
                textViewPassWarn.setText(textViewPassWarn.text.toString())
                textViewPassWarn.visibility = TextView.VISIBLE
            }else{
                textViewPassWarn.visibility = TextView.INVISIBLE
            }

        }
    })
}