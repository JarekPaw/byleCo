package com.example.byleco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            showToast("Bardzo ładnie")
            var activityCalendar: Intent = Intent(applicationContext,ProfileAct::class.java)
            startActivity(activityCalendar)
        }
        button2.setOnClickListener {
            var newActivity1: Intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(newActivity1)
        }

    }
    fun showToast (t: String){
        Toast.makeText(applicationContext, t ,Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

// najpierw trzeba się dostać do intencji, która uruchomiła teraz mainActivity, bo onResume()
// jest ona też wzywana podczas pierwszego uruchomienia app.
// najpierw sprawdzimy czy intencja, która uruchomiła mainActivity ma jakiś dodatek - Extras
        if (intent.hasExtra("plec")) tv2.setText(intent.getCharSequenceExtra("plec"))
    }
}
