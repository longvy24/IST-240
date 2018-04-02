package VehicleRegistration;
import java.util.Scanner;



/**
 *
 * @author Long
 */
public class Vehicle {

    protected String owner;
    protected int regNumber;
   
    
    
    public Vehicle(){
    owner = "";
    regNumber = 0;
    }  
     
    public void setOwner(String o){
    owner = o;
    }    
    public void setRnumber (int r){
    regNumber = r;
    }    
    
    public String getOwner(){
    return owner;
    }   
    public int getRnumber(){
        return regNumber;   
    }    
    


    

}
       

    

