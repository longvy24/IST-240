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
public class FTStudent extends Student {
    
    private boolean inState; 
        
    public void setState(boolean s){
    inState = s;
    
    }
    
    public boolean getState(){
    return inState;
    
    }
    
    public double calTuition(){
    if(inState)
        tuition = 5000;
    else
        tuition = 7500;
    
    return tuition;   
    
    }
    
}
