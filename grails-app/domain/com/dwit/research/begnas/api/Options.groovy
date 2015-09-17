package com.dwit.research.begnas.api

class Options {

    static belongsTo = [question:Question]

    String option1
    String option2
    String option3
    String option4

    static constraints = {
    }
}
