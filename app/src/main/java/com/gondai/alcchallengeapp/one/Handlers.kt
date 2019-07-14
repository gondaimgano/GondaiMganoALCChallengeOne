package com.gondai.alcchallengeapp.one

import android.content.Intent
import android.view.View


class MainScreenHandler{
    fun onProfileClick(view: View){

        view.apply {
            context.apply {
                startActivity(Intent(this,ProfileALCActivity::class.java))

            }
        }

    }

    fun onAboutClick(view: View){
        view.apply {
            context.apply {
                startActivity(Intent(this,AboutALCActivity::class.java))
            }
        }

    }
}