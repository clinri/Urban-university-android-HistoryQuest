package ru.borisov.historyquest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    lateinit var resultPointsTV: TextView
    lateinit var resultGradeTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        resultPointsTV = findViewById(R.id.resultPointsTV)
        resultGradeTV = findViewById(R.id.resultGradeTV)
        val points = intent.getIntExtra("points", 0)
        resultPointsTV.text =
            resources.getString(R.string.text_your_score_points, points.toString())
        val grade = when (points / 100) {
            1 -> "плохой"
            2 -> "неудовлетворительный"
            3 -> "удовлетворительный"
            4 -> "хороший"
            5 -> "отличный"
            else -> ""
        }
        resultGradeTV.text = resources.getString(R.string.text_grade_result, grade)
    }
}