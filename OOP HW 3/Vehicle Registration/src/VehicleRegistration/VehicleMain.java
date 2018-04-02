/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehicleRegistration;


import java.util.Scanner;


/**
 *
 * @author lfv5020
 */
public class VehicleMain {
    
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
           
        System.out.print("Enter your name: ");
        String owner = sc.nextLine();
        System.out.print("Enter your registration number: ");
        int Rnumber = sc.nextInt(); sc.nextLine();
        System.out.print("Enter the make of your car: ");
        String make = sc.nextLine();
        System.out.print("Enter model of your car: ");
        String model = sc.nextLine();
        System.out.print("Enter registration type: ");
        String regType = sc.nextLine();
            
        
        Car c1 = new Car ();   
        c1.setOwner(owner);
        c1.setMake(make);
        c1.setModel(model);
        c1.setRtype(regType);
        c1.setRnumber(Rnumber);
        
        System.out.println("Owner: " + c1.getOwner());
        System.out.println("Registration Number: " + c1.getRnumber());
        System.out.println("Make: " + c1.getMake());
        System.out.println("Model: " + c1.getModel());         
        System.out.println("Registration Type: " + c1.getRtype());
        System.out.println("Registration Fee: " + c1.getRfee());
      
    
    
    
    }
}
