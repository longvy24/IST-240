/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author lfv5020
 */
public class drive {
    /*
    protected double drive; // DRIVE EQUALS DISTANCE TRAVELED
    protected double fuelEfficiency;
    protected double fuelLevel;
   
    public void setDrive (double d){
    drive = d;   
    }
    
    public double getDrive(){
    return drive;
    
    }
    
    void drive (double drive){
    fuelLevel -= drive / fuelEfficiency;
    }
    */
    
    double fuelEfficiency;
    double fuel;
    
    void drive(double distance) {

    fuel -= distance / fuelEfficiency; 

    }     
    
    
    
    
    
}
