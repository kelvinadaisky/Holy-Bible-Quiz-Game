package com.example.holybiblequiz
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import com.example.holybiblequiz.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsActivity : BaseActivity(), View.OnClickListener {

    private var binding: ActivityQuizQuestionsBinding? = null

    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<Question>? = null

    private var earnedPoint : Int = 0

    private var mSelectedOptionPosition: Int = 0

    private var mCorrectAnswers: Int = 0

    private var timeProgress = 0
    private var countDownTimer: CountDownTimer? = null

    private var isButtonsClickable = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        playerName = intent.getStringExtra("playerName")

        whichActivity = 2


        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        mQuestionsList = Constants.getQuestions()

        setQuestion()

        binding?.tvOptionOne?.setOnClickListener(this)
        binding?.tvOptionTwo?.setOnClickListener(this)
        binding?.tvOptionThree?.setOnClickListener(this)
        binding?.tvOptionFour?.setOnClickListener(this)

        binding?.soundIcon?.setOnClickListener {

            showMenuCustomDialog()

        }
        binding?.returnBtn?.setOnClickListener {

            showEndGameCustomDialog()

        }

    }

    private fun setQuestion() {
        if (countDownTimer != null) {
            countDownTimer?.cancel()
            timeProgress = 0
        }

        setTimeProgressBar()

        val question: Question = mQuestionsList!![mCurrentPosition - 1] // Getting the question from the list with the help of current position.
        defaultOptionsView()

        binding?.tvQuestion?.text = question.question
        binding?.tvOptionOne?.text = question.optionOne
        binding?.tvOptionTwo?.text = question.optionTwo
        binding?.tvOptionThree?.text = question.optionThree
        binding?.tvOptionFour?.text = question.optionFour
    }

    override fun onClick(view: View?) {

       if (!isButtonsClickable) {
            return
        }

        // Disable the buttons
        isButtonsClickable = false


        when (view?.id)  {

            R.id.tv_option_one -> {
                binding?.tvOptionOne?.let {
                    selectedOptionView(it, 1)

                }

            }

            R.id.tv_option_two -> {
                binding?.tvOptionTwo?.let {
                    selectedOptionView(it, 2)
                }

            }

            R.id.tv_option_three -> {
                binding?.tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }

            }

            R.id.tv_option_four -> {
                binding?.tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }

            }

        }
        Handler().postDelayed({
            isButtonsClickable = true
        }, 2500)

    }

    private fun answerView(answer: Int, drawableView: Int) {

        when (answer) {

            1 -> {
                binding?.tvOptionOne?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }
            2 -> {
                binding?.tvOptionTwo?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }
            3 -> {
                binding?.tvOptionThree?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }
            4 -> {
                binding?.tvOptionFour?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawableView
                )
            }
        }
    }

   private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this@QuizQuestionsActivity,
            R.drawable.selected_option_border_bg
        )

           val question = mQuestionsList?.get(mCurrentPosition - 1)

           if (question!!.correctAnswer != mSelectedOptionPosition) {

               Handler().postDelayed({

                   tv.background = ContextCompat.getDrawable(
                       this@QuizQuestionsActivity,
                       R.drawable.wrong_option_border_bg
                   )

                   answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                   wrongAnswerSound()
                   Handler().postDelayed({

                       pauseCountdown()

                       showGameFinishedCustomDialog("Game is over")

                   }, 2000)

               },500)



           }

           else {

               Handler().postDelayed({
                   earnedPoint += (100 * (60 - timeProgress)/60)
                   mCorrectAnswers++
                   answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                   correctAnswerSound()

                   Handler().postDelayed({
                       if(mCurrentPosition <=  mQuestionsList!!.size){

                           setQuestion()

                           binding?.tvScore?.text = earnedPoint.toString()

                           binding?.questionNo?.text = mCurrentPosition.toString()

                       }

                       else  {

                           pauseCountdown()

                           showGameFinishedCustomDialog("Congratulation you finished the game")

                       }

                   }, 2000)

               },500)


           }

        mCurrentPosition++


         mSelectedOptionPosition = 0

   }
    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        binding?.tvOptionOne?.let {
            options.add(0, it)
        }
        binding?.tvOptionTwo?.let {
            options.add(1, it)
        }
        binding?.tvOptionThree?.let {
            options.add(2, it)
        }
        binding?.tvOptionFour?.let {
            options.add(3,it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this@QuizQuestionsActivity,
                R.drawable.default_option_border_bg
            )
        }
    }


    override fun onBackPressed() {

        showEndGameCustomDialog()

    }

    private fun showGameFinishedCustomDialog(text: String){

        val dialog = Dialog(this)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_game_over)

        val btnMainMenu: Button = dialog.findViewById(R.id.btnMainMenu)
        val btnRestart: Button = dialog.findViewById(R.id.btnRestart)
        val tvMessage : TextView = dialog.findViewById(R.id.tvMessage)
        val correctAnswers : TextView = dialog.findViewById(R.id.correctAnswers)
        val earnedPoints : TextView = dialog.findViewById(R.id.earnedPoints)

        tvMessage.text = text
        correctAnswers.text = mCorrectAnswers.toString()
        earnedPoints.text = earnedPoint.toString()

        saveData(playerName, earnedPoint)


        btnMainMenu.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            dialog.dismiss()
            finish()
        }
        btnRestart.setOnClickListener {

            val intent = intent
            finish()
            startActivity(intent)
            dialog.dismiss()
        }
        dialog.show()

    }

    private fun showEndGameCustomDialog(){

        val dialog = Dialog(this)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_exit)

        val btnYes: Button = dialog.findViewById(R.id.btnYes)
        val btnNo: Button = dialog.findViewById(R.id.btnNo)
        val tvMessage : TextView = dialog.findViewById(R.id.tvMessage)

        tvMessage.text = "Do you end the game"

        btnNo.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnYes.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

     private fun pauseCountdown() {
     countDownTimer?.cancel()
    }

 private fun setTimeProgressBar() {

     binding?.progressBar?.progress = timeProgress // Sets the current progress to the specified value.

         countDownTimer = object : CountDownTimer(60000, 1000) {
         override fun onTick(millisUntilFinished: Long) {
             timeProgress++
             binding?.progressBar?.progress = timeProgress
             binding?.tvTimer?.text = (60 - timeProgress).toString()
         }

         override fun onFinish() {
             showGameFinishedCustomDialog("Time is up")
         }
     }.start()
 }


}


