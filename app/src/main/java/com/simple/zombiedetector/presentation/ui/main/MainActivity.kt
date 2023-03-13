package com.simple.zombiedetector.presentation.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.simple.zombiedetector.R
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContent {
            Text("Hello compose text")
        }
    }
}