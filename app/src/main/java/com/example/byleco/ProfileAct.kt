package com.example.byleco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*
import java.text.SimpleDateFormat
import java.util.*

class ProfileAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        /* pruba nieudana
        var date: String = intent.getStringExtra("date")
        if (date != null)
            textView_data.setText("date")

        bnt_data.setOnClickListener {
            var nowaAktywn = Intent(applicationContext,CalendarActivity::class.java)
            startActivity(nowaAktywn)
        }*/

        var calendar: Calendar = Calendar.getInstance()
        var simpleDataFormat: SimpleDateFormat = SimpleDateFormat("dd-MMM-yyyy")
        var dataTime: String = simpleDataFormat.format(calendar.time)
        textView_data.setText(dataTime)

        btn_data.setOnClickListener {
            var actCalendar: Intent = Intent(applicationContext,CalendarActivity::class.java)
            startActivity(actCalendar)
        }
    }

    override fun onResume() {
        super.onResume()
        if (intent.hasExtra("login")) textView_login.setText("Twój login: " + intent.getCharSequenceExtra("login"))
        if (intent.hasExtra("email"))  textView_email.setText("Podany e-mail: " + intent.getCharSequenceExtra("email"))
        if (intent.hasExtra("plec")) textView_plec.setText("Twoja płeć: " + intent.getCharSequenceExtra("plec"))
        if (intent.hasExtra("haslo")) textView_passw.setText("Twoje hasło: " + intent.getCharSequenceExtra("hslo"))



    }

}
