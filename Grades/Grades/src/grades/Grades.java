/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;
import java.util.Scanner;

/**
 *
 * @author lfv5020
 */
public class Grades {
    
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
     
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
            
        System.out.print("Enter the score: ");
        double score = sc.nextDouble();
        
        Student s1 = new Student(name, score);
        
        
        System.out.println("Student: " + s1.getName());
        System.out.println("Score: " + s1.getScore());
        System.out.println("Grade: " + s1.calcGrade());
    
    
    
    }
    
}
