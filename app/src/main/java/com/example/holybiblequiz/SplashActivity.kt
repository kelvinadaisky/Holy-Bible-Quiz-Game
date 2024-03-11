package com.example.holybiblequiz
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.holybiblequiz.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {
    private var binding : ActivitySplashBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding?.root)

      binding?.progressBar?.max = 1000
        val currentProgress = 1000
        ObjectAnimator.ofInt(binding?.progressBar,"progress",currentProgress)
            .setDuration(2500)
            .start()

        Handler().postDelayed({

            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 3000)
    }
    public override fun onDestroy() {

        super.onDestroy()
        binding = null
    }

}