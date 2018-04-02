/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;


public class Student {
    
        private String name;
        private double score;
        private String grade;
       
        public Student(String n, double s){
        
         name = n;
         score = s;
        
        }
        
        
        public void setName(String n){
        
            name = n;
        }
        
        public void setScore(double s){
        
            score = s;
        }
        
       public String getName(){
       return name; 
       }  
       
       public double getScore(){
       return score;
       }
       
       public String calcGrade(){
       
           if (score>=90)
               grade = "A";
           else if (score>= 80)
               grade = "B";
           else if (score >= 70)
               grade = "C";
           else 
               grade = "F";
      
           return grade;
       }

    
}
