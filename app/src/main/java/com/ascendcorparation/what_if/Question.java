package com.ascendcorparation.what_if;

import com.orm.SugarRecord;

public class Question extends SugarRecord{
    private String question;
    private int number;

    public Question() {
    }

    public String getQuestion() {
        return question;
    }
    
    public Question(String question, int number) {
        this.question = question;
        this.number = number;
    }

}
