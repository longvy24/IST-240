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
public class Faculty extends Person {
    
    private String dept;
    private String ParkingLot;
    
    /*
    public Faculty(String n, String d){
    super(n);
    dept = d;
    }
    */
    
    public void setSubject(String d){
    dept = d;
    }
    
    public void setParkingLot(String p){
    ParkingLot = p;
    }
    
    public String getDept(){
    return dept;
    }
    
    public String getParkingLot(){
    return ParkingLot;
    }
    
     public String calcLot(){
        
         switch(dept){
                 case "1":  
                 case "3": ParkingLot = "F1";
                         break;
                 case "2": ParkingLot = "F2";
                     break;
                 case "4": ParkingLot = "F3";
                     break;
                 case "5": ParkingLot = "F4";
                     break;
                 default: ParkingLot = "V1";   
                     }
         return ParkingLot;

                }
    
    
}
