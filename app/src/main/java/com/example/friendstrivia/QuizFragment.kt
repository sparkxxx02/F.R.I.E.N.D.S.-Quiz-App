package com.example.friendstrivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.friendstrivia.databinding.QuizLayoutBinding
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.quiz_layout.*
import kotlin.properties.Delegates

/**
 * A simple [Fragment] subclass.
 */
class QuizFragment : Fragment() {
    data class Question(
        var text: String,
        val answers: List<String>,
        var image: Int
    )

    private val questions: MutableList<Question> = mutableListOf(
        Question(
            text = "Rachel was popular in high school. Her prom date Chip ditched her for which girl at school?",
            answers = listOf("Amy Welsh","Sally Roberts" , "Valerie Thompson"),
            image = R.drawable.q1
        ),
        Question(
            text = "What’s the name of the 1950s-themed diner where Monica worked as a waitress?",
            answers = listOf("Moondance Diner","Marilyn & Audrey", "Twilight Galaxy" ),
            image = R.drawable.q2
        ),
        Question(
            text = "Janice gets married twice. What’s was her first husband’s name?",
            answers = listOf("Gary Litman", "Sid Goralnik", "Rob Bailystock"),
            image = R.drawable.q3
        ),
        Question(
            text = "What’s Joey’s penguin’s name?",
            answers = listOf("Huggsy","Snowflake", "Waddle"),
            image = R.drawable.q4
        ),
        Question(
            text = "When Ross and Rachel were“on a break,Ross slept with Chloe. Where does she work?",
            answers = listOf("Xerox", "Microsoft", "Domino’s"),
            image = R.drawable.q5
        ),
        Question(
            text = "Chandler’s mom had an interesting career and even more interesting love life. What’s her name?",
            answers = listOf("Nora Tyler Bing", "Priscilla Mae Galway", "Mary Jane Bing"),
            image = R.drawable.q6
        ),
        Question(
            text = "What fake name does Phoebe use when she wants to remain anonymous?",
            answers = listOf("Regina Phalange","Bonnie Riddle","Phyllis Halpert"),
            image= R.drawable.q7
        ),
        Question(
            text = "How much of Joey’s heritage is Portuguese?",
            answers = listOf("1/16","1/8","1/4"),
            image = R.drawable.q8
        ),
        Question(
            text = "Chandler is a unique first name, but Bing is something different! Chandler says that his last name is Gaelic for what?",
            answers = listOf("“Thy turkey’s done.”","“Huzzah! The team has scored.”", "“Thou hast received a telegram.”"),
            image = R.drawable.q9
        ),
        Question(
            text = "Before being called“Friends,the show was actually named this:",
            answers = listOf("Insomnia Cafe","Sleepless Cafe","Amigo’s Cafe"),
            image = R.drawable.q10
        )

    )
    lateinit var currentQuestion: Question
    lateinit var ans: MutableList<String>
    private var questionIndex: Int = 0
    private var correctquestion :Int= 0
    var imageindex by Delegates.notNull<Int>()
    lateinit var drawable:ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<QuizLayoutBinding>(
            inflater,
            R.layout.quiz_layout,
            container,
            false
        )
        drawable=binding.imageView3.findViewById(R.id.imageView3)
        randomizeQuestions()
        binding.quiz=this
        binding.submit.setOnClickListener { view: View ->

            val checkedId = binding.questionRGP.checkedRadioButtonId
            if (-1 != checkedId) {
                var answerschecked = 0
                when (checkedId) {
                    R.id.radioButton2 -> answerschecked = 1
                    R.id.radioButton3 -> answerschecked = 2
                }
                if (ans[answerschecked] == currentQuestion.answers[0]) {
                    Toast.makeText(context,"Correct",Toast.LENGTH_SHORT).show()
                    correctquestion++
                }
                else
                    Toast.makeText(context,"Wrong",Toast.LENGTH_SHORT).show()
                questionIndex++
                if (questionIndex < 4) {
                    currentQuestion = questions[questionIndex]
                    setQuestion()
                    binding.questionRGP.clearCheck()
                    binding.invalidateAll()
                }
                else if(correctquestion == 4) {
                    view.findNavController()
                        .navigate(QuizFragmentDirections.actionQuizFragmentToWinnerFragment(4, correctquestion))
                }
                else {
                    view.findNavController()
                        .navigate(QuizFragmentDirections.actionQuizFragmentToLostFragment2(4,correctquestion))
                }
            }
        }
    return binding.root
    }


    private fun randomizeQuestions() {
        questions.shuffle()
        questionIndex = 0
        setQuestion()
    }

    private fun setQuestion() {
        currentQuestion = questions[questionIndex]
        imageindex = currentQuestion.image

        drawable.setImageResource(imageindex)
        ans = currentQuestion.answers.toMutableList()
        ans.shuffle()
        (activity as AppCompatActivity).supportActionBar?.title =
            getString(R.string.title, questionIndex + 1, 4)

    }
}

