package com.something.cwchoroscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Array.get

class MainActivity : AppCompatActivity() {

    internal lateinit var sp_month : Spinner
    internal lateinit var sp_days : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedMonth()

    }

    private fun selectedMonth(){
        //Referencing Spinner1 to sp_month
        sp_month = findViewById(R.id.spinner1)
        //Month array
        val months = arrayOf("Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
        //Month layout on app
        val month_adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, months)
        //Binding month adapter with an adapter
        sp_month.adapter = month_adapter

        //String variable for the selected month
        var month_string: String = ""

        //Store selected month to month string variable from month spinner
        sp_month.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var placeholder = parent?.getItemAtPosition(position)
                if (placeholder != "Month") {

                    month_string = parent?.selectedItem.toString()

                    //Send selected month to selectedDay()
                    selectedDay(month_string)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }
    }

    private fun selectedDay(month_string: String){

        //Referencing Spinner2 to sp_days
        sp_days = findViewById(R.id.spinner2)
        //Day array
        val days = arrayOf("Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31")
        //Day layout on app
        val day_adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, days)
        sp_days.adapter = day_adapter

        //Setting up variable to store selected day
        var day_string: String = ""

        //Store selected day to day string variable from day spinner
        sp_days.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var placeholder = parent?.getItemAtPosition(position)
                if (placeholder != "Day") {

                    day_string = parent?.selectedItem.toString()

                    //Send both selected month and day to submitButton()
                    submitButton(month_string, day_string)
                }
            }
        }
    }

    private fun submitButton(monthString: String, dayString: String) {
        //Test to see if monthString and dayString is null or empty to activate the submit button
        if ( (monthString != "Month") && (dayString != "Day") ) {
            submit_button.isEnabled = true
            //Showing submit button to the user
            submit_button.animate().alpha(1f).setDuration(200)

            //Enabling the button to load the horoscope() with the values of monthString and dayString
            val Submitbtn = findViewById<Button>(R.id.submit_button)

            Submitbtn.setOnClickListener {
                horoscope(monthString, dayString)
            }
        }
    }

    private fun horoscope(monthString: String, dayString: String){
        //Here we will create the if/else statements to load certain activity pages depending on the user input

        val months = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
        var January : String = ""
        January = months[0]
        var February : String = ""
        February = months[1]
        var March : String = ""
        March = months[2]
        var April : String = ""
        April = months[3]
        var May : String = ""
        May = months[4]
        var June : String = ""
        June = months[5]
        var July : String = ""
        July = months[6]
        var August : String = ""
        August = months[7]
        var September : String = ""
        September = months[8]
        var October : String = ""
        October = months[9]
        var November : String = ""
        November = months[10]
        var December : String = ""
        December = months[11]

        if (monthString == January) {
            if (dayString.toInt() <= 20) {
                //Load Wild Sonichu page
            } else if (dayString.toInt() > 20) {
                //Load Bubbles Rosechu page
            }
        }
        else if (monthString == February) {
            if (dayString.toInt() <= 19) {
                //Load Bubbles Rosechu page
            }
            else if (dayString.toInt() > 19){
                //Load Angelica Rosechu page
            }
        }
        else if (monthString == March){
            if (dayString.toInt() <= 21){
                //Load Angelica Rosechu page
            }
            else if (dayString.toInt() > 21){
                //Load Sonichu page
            }
        }
        else if (monthString == April){
            if (dayString.toInt() <= 20){
                //Load Sonichu page
            }
            else if (dayString.toInt() > 20){
                //Load Rosechu page
            }
        }
        else if (monthString == May){
            if (dayString.toInt() <= 21){
                //Load Rosechu page
            }
            else if (dayString.toInt() > 21){
                //Load Blachu page
            }
        }
        else if (monthString == June){
            if (dayString.toInt() <= 21){
                //Load Blachu page
            }
            else if (dayString.toInt() > 21){
                //Load Magichu page
            }
        }
        else if (monthString == July){
            if (dayString.toInt() <= 23){
                //Load Magichu page
            }
            else if (dayString.toInt() > 23){
                //Load Asperchu page
            }
        }
        else if (monthString == August){
            if (dayString.toInt() <= 23){
                //Load Asperchu page
            }
            else if (dayString.toInt() > 23){
                //Load Metonic page
            }
        }
        else if (monthString == September){
            if (dayString.toInt() <= 23){
                //Load Metonic page
            }
            else if (dayString.toInt() > 23){
                //Load Vamprosa page
            }
        }
        else if (monthString == October){
            if (dayString.toInt() <= 23){
                //Load Vamprosa page
            }
            else if (dayString.toInt() > 23){
                //Load Saramah Rosechu page
            }
        }
        else if (monthString == November){
            if (dayString.toInt() <= 22){
                //Load Saramah Rosechu page
            }
            else if (dayString.toInt() > 22){
                //Load Count Graduon page
            }
        }
        else if (monthString == December){
            if (dayString.toInt() <= 22){
                //Load Count Graduon page
            }
            else if (dayString.toInt() > 22){
                //Load Wild Sonichu page
            }
        }
        submit_button.isEnabled = false
    }
}
