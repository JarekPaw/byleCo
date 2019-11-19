package com.example.byleco

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

fun emailValidity(editTextEmail: EditText, textViewEmailWarn: TextView){
    editTextEmail.addTextChangedListener(object: TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            if (editTextEmail.length() == 0){
                textViewEmailWarn.visibility = TextView.INVISIBLE
            }
        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            if (editTextEmail.text.toString().contains('@')){
                textViewEmailWarn.visibility = TextView.INVISIBLE
            }else{
                textViewEmailWarn.setText("email nieprawidłowy")
                textViewEmailWarn.visibility = TextView.VISIBLE
            }


        }
    })
    // //sprawdzanie maila przeniesione do odzielnej aktywności
}