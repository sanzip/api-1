package com.dwit.research.begnas.api

class Question {

    String question
    Boolean isSkipped = false

    static hasMany = [options: Options]
    //Boolean enabled

    static constraints={
        question(nullable: false, unique: true)
        isSkipped()
    }

    String toString(){
        return "${question}"
    }

}
