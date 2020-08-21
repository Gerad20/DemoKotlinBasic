package com.myapplicationdev.android.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGetAge.setOnClickListener {

            val userDOB = etDob.text.toString()
            //if version

            if(userDOB.isNotEmpty()){
                var year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt()
                tvShowAge.text = "Your Age is $age"
                var output = "";
                if(age < 18){
                    output = "Underage"
                }else if(age in 18..65){
                    output = "Young People"

                }else if (age in 66..99){
                    output = "Elderly People"
                }else{
                    output = "Long lived Elderly"
                }
                when(age){
                    in 0..17 ->output = "underage"
                    in 18..65 ->output = "Young People"
                    in 66..99 -> output = "Elderly People"
                    else -> output = "Long lived Elderly"
                }


                }else{
                    Toast.makeText(applicationContext,"Please Enter the birth year",Toast.LENGTH_LONG).show();
            }
        }
    }
}