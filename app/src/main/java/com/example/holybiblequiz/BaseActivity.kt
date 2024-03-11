package com.example.holybiblequiz

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.example.holybiblequiz.models.Score

abstract class BaseActivity : AppCompatActivity() {

    private var doubleBackToExitPressedOnce = false

    private var trueAnswerSound: MediaPlayer? = null
    private var falseAnswerSound: MediaPlayer? = null

    private lateinit var dialog : BottomSheetDialog

    var playerName : String? = null

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchMusic: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switchSound: Switch
    private lateinit var aboutApp: View
    private lateinit var moreApp: View


    var whichActivity : Int? = null



    /**
     * This is a progress dialog instance which we will initialize later on.
     */
   // private lateinit var mProgressDialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    fun doubleBackToExit() {
        if (doubleBackToExitPressedOnce) {
                super.onDestroy()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(
                this,
                resources.getString(R.string.please_click_back_again_to_exit),
                Toast.LENGTH_SHORT
        ).show()

        Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }
         fun showMenuCustomDialog(){

         val dialogView = layoutInflater.inflate(R.layout.dialog_menu,null)
        dialog = BottomSheetDialog(this,R.style.BottomSheetDialogTheme)
        dialog.setContentView(dialogView)
        dialog.setCancelable(true)
        dialog.show()

             switchSound = dialog.findViewById(R.id.soundButton)!!
         //    aboutApp = dialog.findViewById(R.id.about_app)!!
        //     moreApp = dialog.findViewById(R.id.moreapp)!!
         /*    if (whichActivity==2){
                 aboutApp.visibility = View.GONE
                 moreApp.visibility = View.GONE
             } */


             switchSound.isChecked = SwitchSoundManager.switchSoundState



             switchSound.setOnCheckedChangeListener { _, isChecked ->
                 SwitchSoundManager.switchSoundState = isChecked
                 saveSwitchSoundState(isChecked)
             }

         }

     fun correctAnswerSound() {
        if(SwitchSoundManager.switchSoundState){
            try {
                val soundURI =
                    Uri.parse("android.resource://com.umurundi.myapplication/" + R.raw.correct_answer_sound_effect)
                trueAnswerSound = MediaPlayer.create(applicationContext, soundURI)
                trueAnswerSound?.isLooping = false // Sets the player to be looping or non-looping.
                trueAnswerSound?.start() // Starts Playback.
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

     }
    fun wrongAnswerSound() {
        if (SwitchSoundManager.switchSoundState) {
            try {
                val soundURI =
                    Uri.parse("android.resource://com.umurundi.myapplication/" + R.raw.wrong_answer_sound)
                falseAnswerSound = MediaPlayer.create(applicationContext, soundURI)
                falseAnswerSound?.isLooping = false // Sets the player to be looping or non-looping.
                falseAnswerSound?.start() // Starts Playback.
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }
    fun showCustomDialog(){

        val dialog = Dialog(this)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.custom_dialog_login)

        val btnStart : Button = dialog.findViewById(R.id.btnStart)
        val etName : AppCompatEditText = dialog.findViewById(R.id.etName)

        btnStart.setOnClickListener {
            if (etName.text!!.isEmpty()){
                Toast.makeText(this,"please enter your name", Toast.LENGTH_LONG).show()
            }else{
                playerName = etName.text.toString()
                dialog.dismiss()
                val intent= Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra("playerName", playerName)
                startActivity(intent)
                finish()

            }
        }
        dialog.show()
    }

    fun saveData(playerName: String?, score: Int) {
        val sharedPreferences = getSharedPreferences("game_data", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val index = sharedPreferences.getInt("index", 1)

        // Vérifier si le score actuel est l'un des 5 plus grands scores
        if (index <= 11 || score > getLowestHighScore()) {
            val playerNameKey = "player_name_$index"
            val scoreKey = "score_$index"

            editor.putString(playerNameKey, playerName)
            editor.putInt(scoreKey, score)
            editor.putInt("index", index + 1)

            editor.apply()
            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show()

            // Vérifier si le nombre de scores dépasse 5 et supprimer le plus bas score
            if (index > 11) {
                val lowestHighScore = getLowestHighScore()
                removeLowestHighScore(lowestHighScore)
            }
        }
    }

    fun getHighScores(): List<Score> {
        val sharedPreferences = getSharedPreferences("game_data", Context.MODE_PRIVATE)
        val highScores = mutableListOf<Score>()

        val index = sharedPreferences.getInt("index", 1)

        for (i in 1 until index) {
            val playerName = sharedPreferences.getString("player_name_$i", "")
            val scoreValue = sharedPreferences.getInt("score_$i", 0)
            if (playerName != "" && scoreValue != 0) {
                val score = Score(scoreValue, playerName)
                highScores.add(score)
            }
        }

        return highScores.sortedByDescending { it.score }.take(5)
    }

    private fun getLowestHighScore(): Int {
        val highScores = getHighScores()
        return if (highScores.isNotEmpty()) {
            highScores.last().score
        } else {
            0
        }
    }

    private fun removeLowestHighScore(score: Int) {
        val sharedPreferences = getSharedPreferences("game_data", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val index = sharedPreferences.getInt("index", 1)

        for (i in index - 1 downTo 1) {
            val scoreValue = sharedPreferences.getInt("score_$i", 0)
            if (scoreValue == score) {
                // Supprimer le score et le nom du joueur correspondant
                editor.remove("score_$i")
                editor.remove("player_name_$i")
            }
        }

        editor.apply()
    }

    private fun saveSwitchSoundState(isSoundOn: Boolean) {
        val sharedPreferences= getSharedPreferences("SoundPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean("isSoundOn", isSoundOn)
        editor.apply()
    }
    fun getSwitchSoundState(): Boolean {
        val sharedPreferences = getSharedPreferences("SoundPrefs", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("isSoundOn", true) // true est la valeur par défaut si aucune valeur n'est trouvée
    }

    fun getSwitchState(context: Context): Boolean {
        val sharedPreferences = context.getSharedPreferences("SwitchPrefs", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("isSwitchChecked", true) // true est la valeur par défaut si aucune valeur n'est trouvée
    }


}
