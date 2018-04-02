/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author lfv5020
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.printf("%-15s%-15s%9s%n", "First", "Last", "Balance");
        System.out.printf("%-15s%-15s$%8.2f%n", "Charlie", "Brown", 100.78);
         */

        String fname;
        System.out.println("Enter your first name: ");
        fname = sc.next();

        char finitial;
        finitial = fname.charAt(0);

        String rest;
        rest = fname.substring(1);

        System.out.println("Your name is: " + fname);
        System.out.println("Your first initial is: " + finitial);
        System.out.println("The rest of your name is: " + rest);

        /*    
         int num;
        System.out.print("Enter a positive integer between 0-10: ");
        num = sc.nextInt();
        
        if (num < 0 || num > 10 )
            System.out.println("Invalid");
        else if(num==0)
            System.out.println("Low");
        else if(num==1||num==2)
            System.out.println("Medium");
        else
            System.out.println("High");
         */
 /*   
           
        int score;
        int sumScores = 0;
        
        for(int i=1; i<=3; i++){
        System.out.println("Enter your score: ");
        score = sc.nextInt();  
        sumScores = sumScores + score;
        }
        System.out.format("The average is %.1f%n" , sumScores/3.0);
        
         
        System.out.println("Hello, World!");
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_WEEK);
        System.out.println("Today is " + day ); 
    
        switch(day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;        
            case 4:
                System.out.println("Wednesday");
                break;        
            case 5:
                System.out.println("Thursday");
                break;        
            case 6:
                System.out.println("Friday");
                break;        
            case 7:
                System.out.println("Saturday");
                break;                    
   
        }        
         */
    }
}
