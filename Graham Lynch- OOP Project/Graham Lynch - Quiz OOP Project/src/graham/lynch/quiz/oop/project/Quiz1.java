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
public class Quiz1 implements Serializable {
    private static final long serialVersionUID = 396761391099611537L;
    String name;
    int score1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public Quiz1(String name, int score1) {
        this.name = name;
        this.score1 = score1;
    }
}
