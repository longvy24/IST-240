/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;
import java.util.Scanner;


/**
 *
 * @author lfv5020
 */
public class Parking {
    
   Faculty f1 = new Faculty();
   Student s1 = new Student();

  
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        f1.setName(name);
        
        System.out.print("Enter your dept (1-5) ");
        String dept = sc.nextLine();
        f1.setSubject(dept);
        
        System.out.println("Name: " + f1.getName());
        System.out.println("Dept: " + f1.getDept());
        System.out.println("ParkingLot: " + f1.calcLot());
        
        
        
        
        System.out.print("Enter your name: ");
        String Sname = sc.nextLine();
        s1.setName(Sname);
        
        System.out.print("Enter your Major:  /n" +
                          "1: Liberal Arts, Science, Education /n" +
                          "2: Engineering, Business /n" +
                          "3: Undecided/non-degree" );
        
        String major = sc.nextLine();
        s1.setMajor(major);
        
        System.out.println("Name: " + s1.getName());
        System.out.println("Dept: " + s1.getMajor());
        System.out.println("ParkingLot: " + s1.calcLot());
        
         
    }
    
}
