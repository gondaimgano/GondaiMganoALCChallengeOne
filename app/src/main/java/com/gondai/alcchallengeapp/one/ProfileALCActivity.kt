package com.gondai.alcchallengeapp.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class ProfileALCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_alc)
    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }
}
