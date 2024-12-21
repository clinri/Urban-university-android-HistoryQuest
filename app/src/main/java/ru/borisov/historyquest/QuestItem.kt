package ru.borisov.historyquest

data class QuestItem(
    val question: String,
    val answerList: List<String>,
    val correctAnswer: String,
)
