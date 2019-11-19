package com.example.byleco

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        imageView1.setImageResource(R.drawable.logo_big)

        /*editText2.setText("kto to")
        var str: String = editText2.getText().toString()
        textView3.setText(str)
        to wykona się tylko raz an starcie, ale działa

        Poprawny sposób to wykożystanie metody onTextChange() pokazany jest poniżej.
        Sprawdza na bierząco długość znaków
        Lepszy niż metoda onUserInteraction
        */
// czy hasło ma więcej niż 6 znaków?
        passwordValidity(editTextPass,textViewPassWarn)
// walidacja adresu email
        emailValidity(editTextEmail,textViewEmailWarn)

        /* zakomentowana obsługa radiobutton

// obsługa radioGrup
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            run {
                //chemy wrócić do maniActivity i ustawić płeć, wiec trzeba stworzyć nową intencje i poinform
                //mainActivity, że w secondActivity wybraliśmy właśnie tą opcje - do tego służą Extras
                val intencjaAktywujaca: Intent = Intent(applicationContext,MainActivity::class.java)

                //pobieranie tekstu z kliknietego RadioButton (po id trzeba znaleźć przycisk i dostać się do pola text)
                var RB: RadioButton = findViewById(checkedId) //zwróci kliknięty radiobutton
                intencjaAktywujaca.putExtra("plec",RB.text)
                startActivity(intencjaAktywujaca)


            } }

         koniec */
    }


    /* fun onUserInteraction() To co poniżej działa prawidłowo

    override fun onUserInteraction() { //metoda wykonuje się za każdym razem gdy będzie jakaś interakcja

       // var str: String = editText2.getText().toString()
        //textView3.setText(str)
        super.onUserInteraction()
        //teraz będzie wyświeltać po każdej literce.
        // walidacja email 6 znaków
        if (editTextPass.isFocused){
            if(editTextPass.length() < 6){
                textViewPassWarn.setText("Słabe hasło")
                textViewPassWarn.visibility = TextView.VISIBLE
            }else{
                textViewPassWarn.visibility = TextView.INVISIBLE
            }

        }else{
            textViewPassWarn.visibility = TextView.INVISIBLE
        }
        //weryfikacja email
        if (editTextEmail.isFocused){
            for (i in editTextEmail.text){
                if (i == '@'){
                    textViewEmailWarn.visibility = TextView.INVISIBLE
                }else{textViewEmailWarn.setText("niepoprawny email")
                    textViewEmailWarn.visibility = TextView.VISIBLE
                }
            }
        }else{
            if (editTextEmail.length() > 0 && editTextEmail.length() < 6){
                textViewEmailWarn.setText("niepoprawny email")
                textViewEmailWarn.visibility = TextView.VISIBLE
            }else {
                textViewEmailWarn.setText("poda email")
                textViewEmailWarn.visibility = TextView.VISIBLE
            }
        }
    }*/

// inny sposób przypisania metody do przycisku - nie onClickListener

    fun submitData(view: View){
        if(!cBregulam.isChecked)
            Toast.makeText(applicationContext, "Potwierdż regulamin", Toast.LENGTH_LONG)
                .show()
        else{
            var intAktThird: Intent = Intent(applicationContext,ProfileAct::class.java)
            intAktThird.putExtra("login",editTextLogin.text)
            intAktThird.putExtra("haslo", editTextPass.text)
            intAktThird.putExtra("email", editTextEmail.text)
            intAktThird.putExtra("plec", findViewById<RadioButton>(radioGroup.checkedRadioButtonId).text)
            startActivity(intAktThird)

        }
    }

}
