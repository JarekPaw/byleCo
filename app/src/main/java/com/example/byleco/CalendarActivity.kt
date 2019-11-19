package com.example.byleco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calendar.*
import kotlinx.android.synthetic.main.activity_third.*
import java.text.SimpleDateFormat
import java.util.*

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

       /* wyświetli aktualna datę we  wskazanym polu tekstowym
       var calendar: Calendar = Calendar.getInstance()
        var simpleDataFormat: SimpleDateFormat = SimpleDateFormat("dd-MMM-yyyy")
        var dataTime: String = simpleDataFormat.format(calendar.time)
        textView_data.setText(dataTime)*/







    }
}
