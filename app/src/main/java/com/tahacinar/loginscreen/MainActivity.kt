package com.tahacinar.loginscreen

import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.tahacinar.loginscreen.databinding.ActivityMainBinding
import android.os.Bundle as Bundle1

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var username : EditText
    lateinit var password: EditText
    lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






    }

}