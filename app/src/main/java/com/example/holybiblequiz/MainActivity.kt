package com.example.holybiblequiz

import android.content.Intent
import android.os.Bundle
import com.example.holybiblequiz.databinding.ActivityMainBinding


class MainActivity : BaseActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        whichActivity = 1

        getSwitchSoundState()

        binding?.flStart?.setOnClickListener {
           showCustomDialog()
        }

         binding?.flBMI?.setOnClickListener {
            val intent = Intent(this, HighScoreActivity::class.java)
            startActivity(intent)
        }


        //  Adding a click event to launch the History Screen Activity from Main Activity.)
        // START
         binding?.flHistory?.setOnClickListener {
             showMenuCustomDialog()
         }


    }
    override fun onBackPressed() {
        doubleBackToExit()
    }

}

