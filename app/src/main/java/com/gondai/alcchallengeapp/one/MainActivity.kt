package com.gondai.alcchallengeapp.one

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gondai.alcchallengeapp.one.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       val binding=   DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.handler=MainScreenHandler()

    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }
}
