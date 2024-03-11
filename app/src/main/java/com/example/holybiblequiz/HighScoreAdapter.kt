package com.example.holybiblequiz
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.holybiblequiz.databinding.ItemTopPlayerBinding
import com.example.holybiblequiz.models.Score

class HighScoreAdapter(private val scoreList: ArrayList<Score>) :
    RecyclerView.Adapter<HighScoreAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTopPlayerBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val score = scoreList[position]
        holder.bind(score)
        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(
                Color.parseColor("#EBEBEB")
            )
        } else {
            holder.itemView.setBackgroundColor(
                Color.parseColor("#FFFFFF")
            )
        }
    }

    override fun getItemCount(): Int {
        return scoreList.size
    }

    inner class ViewHolder(private val binding: ItemTopPlayerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(score: Score) {
            binding.tvName.text = score.name
            binding.tvScore.text = score.score.toString()
        }
    }
}
