/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

/**
 *
 * @author lfv5020
 */
public class Student extends Person {
    
    private String major;
    private String ParkingLot;
    
    public void setMajor(String m){
        major = m;
    }
    
    public void setParkingLot(String p){
        ParkingLot = p;        
    }
    
    public String getMajor(){
    return major;
    }
    
    public String getParkingLot(){
        return ParkingLot;
    }
    
       public String calcLot(){
        
         switch(major){
                 case "1": 
                     ParkingLot = "S1";
                     break;
                 case "2": 
                     ParkingLot = "S2";
                     break;
                 case "3":
                     ParkingLot = "S3";
                     break;
                 default: 
                     ParkingLot = "V1";   
      
                      }
                        return ParkingLot;
    
                                }

}


