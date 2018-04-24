/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graham.lynch.quiz.oop.project;

import java.io.Serializable;

/**
 *
 * @author graha
 */
public class Quiz implements Serializable  {
 private static final long serialVersionUID = 8592284857700998112L;
 private String question, name;
 private int score1;

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Quiz(String question) {
        this.question = question;
    }

   



}
 


