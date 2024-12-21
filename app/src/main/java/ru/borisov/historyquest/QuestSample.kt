package ru.borisov.historyquest

class QuestSample {
    companion object {
        val questItemList = listOf(
            QuestItem(
                question = "Согласно норманнской теории, в образовании Киевской Руси главную роль сыграли:",
                answerList = listOf(
                    "Варяги",
                    "Хазары",
                    "Греки",
                ),
                correctAnswer = "Варяги",
            ),
            QuestItem(
                question = "Древнерусское государство образовалось в:",
                answerList = listOf(
                    "622 г.",
                    "862 г.",
                    "1015 г.",
                ),
                correctAnswer = "862 г.",
            ),
            QuestItem(
                question = "В Древней Руси налог в пользу церкви назывался:",
                answerList = listOf(
                    "десятина",
                    "урок",
                    "подушная подать",
                ),
                correctAnswer = "десятина",
            ),
            QuestItem(
                question = "Русь окончательно распадается на отдельные княжества после смерти:",
                answerList = listOf(
                    "Мстислава Великого",
                    "Владимира Мономаха",
                    "Юрия Долгорукого",
                ),
                correctAnswer = "Мстислава Великого",
            ),
            QuestItem(
                question = "На какое количество феодальных центров распалось Древнерусское государство в середине XII в:",
                answerList = listOf(
                    "17",
                    "20",
                    "15",
                ),
                correctAnswer = "15",
            ),
        )
    }
}