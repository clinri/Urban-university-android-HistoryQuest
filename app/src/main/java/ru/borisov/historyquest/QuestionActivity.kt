package ru.borisov.historyquest

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.forEachIndexed

class QuestionActivity : AppCompatActivity() {
    lateinit var questionTV: TextView
    lateinit var questItemRG: RadioGroup
    var points: Int = 0
    var indexQuestItem: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        initViews()
        intent.apply {
            points = getIntExtra("points", 0)
            indexQuestItem = getIntExtra("indexQuestItem", 0)
        }
        val questItem = QuestSample.questItemList[indexQuestItem]
        bindRadioGroup(questItem)
        setRadioGroupClickListener(questItem)
    }

    private fun initViews() {
        questionTV = findViewById(R.id.questionTV)
        questItemRG = findViewById(R.id.questItemRG)
    }

    private fun bindRadioGroup(questItem: QuestItem) {
        questionTV.text = questItem.question
        questItemRG.forEachIndexed { index, radioButton ->
            (radioButton as RadioButton).text = questItem.answerList[index]
        }
    }

    private fun setRadioGroupClickListener(questItem: QuestItem) {
        questItemRG.setOnCheckedChangeListener { _, checkedId ->
            val isCorrect = findViewById<RadioButton>(checkedId).text == questItem.correctAnswer
            if (isCorrect) points += 100
            startNextActivity()
        }
    }

    private fun startNextActivity() {
        val intent = if (indexQuestItem < QuestSample.questItemList.size - 1) {
            Intent(this, QuestionActivity::class.java).apply {
                putExtra("points", points)
                putExtra("indexQuestItem", indexQuestItem + 1)
            }
        } else {
            Intent(this, ResultActivity::class.java).apply {
                putExtra("points", points)
            }
        }
        startActivity(intent)
        finish()
    }
}