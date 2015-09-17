package com.dwit.research.begnas.api

class Subject {

    String subject
    static hasMany=[questions:Question]

    static constraints = {
    }
}
