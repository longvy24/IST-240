/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author lfv5020
 */
public class Display {
    
       public static void main(String[] args) {
        
       Student s = new Student();
       Instructor t = new Instructor();
       
       s.setName("Long Vy");
       s.setYear("1993");
       s.setMajor("Information Science Technology");
       
       t.setName("Bruce Lee");
       t.setYear("1940");
       t.setSalary(1000000);
       
       System.out.println("Name: " + s.getName());
       System.out.println("Birth Year: " + s.getYear());
       System.out.println("Major: " + s.getMajor());
       System.out.println("");
       System.out.println("Instructor: " + t.getName());
       System.out.println("Birth Year: " + t.getYear());
       System.out.println("Salary: " + t.getSalary());
                 
           
           
           
    }
    
}
