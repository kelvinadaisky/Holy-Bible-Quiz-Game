package com.example.holybiblequiz
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.holybiblequiz.databinding.ActivityHighScoreBinding


class HighScoreActivity : BaseActivity() {

    private var binding: ActivityHighScoreBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHighScoreBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val highScores = getHighScores()

        if (highScores.isEmpty()) {
            binding?.tvNoDataAvailable?.visibility = View.VISIBLE
            binding?.scoreRecycle?.visibility = View.GONE
        } else {
            binding?.tvNoDataAvailable?.visibility = View.GONE
            binding?.scoreRecycle?.visibility = View.VISIBLE

            val adapter = HighScoreAdapter(ArrayList(highScores))
            binding?.scoreRecycle?.layoutManager = LinearLayoutManager(this)
            binding?.scoreRecycle?.adapter = adapter
        }
    }


}