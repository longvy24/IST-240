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
public class PTStudent extends Student {
    
    private double credits;
       
    
    public void setCredits(double c){
    credits = c;
    }
   
    public double getCredits(){
        return credits;
    }
    
    public double calTuition(){
    tuition = credits *500;
    return tuition;
    
    }
    
    /*
    public double getTuition(){
    
    return tuition;
    }
    */
    
    
}
