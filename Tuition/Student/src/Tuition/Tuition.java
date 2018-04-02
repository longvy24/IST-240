/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuition;

/**
 *
 * @author lfv5020
 */
public class Tuition {
    
    public static void main (String[] args){
        FTStudent ft1 = new FTStudent();
        ft1.setName("Long Vy");
        ft1.setID("123");
        ft1.setState(true);
        
        System.out.println("Name: " + ft1.getName());
        System.out.println("ID#: " + ft1.getID());
        System.out.println("In-State?: " + ft1.getState());
        System.out.printf("The tuition is: $%.2f", ft1.calTuition());
    
    
    }
    
}
