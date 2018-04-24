/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graham.lynch.quiz.oop.project;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author graha
 */
public class FileIO implements Serializable {
    
    
public void writeQuestionsToFile(ArrayList<Quiz> questions1) {
        try {
            File outputFile = new File("Questions.dat");
            FileOutputStream fos = new FileOutputStream(outputFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(questions1);

            JOptionPane.showMessageDialog(null,"Written to file");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + e.getMessage());
        }
    }

 public ArrayList readQuestionsFromFile() {
        ArrayList<Quiz> QuestionsFromFile = null;
        
        try {
            File inFile = new File("Questions.dat");
            FileInputStream fis = new FileInputStream(inFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            QuestionsFromFile = (ArrayList<Quiz>) ois.readObject();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + e.getMessage());
        }
        
        return QuestionsFromFile;
    }
}
