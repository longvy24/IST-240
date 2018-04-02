/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehicleRegistration;

        
/**
 *
 * @author Long
 */
public class Car extends Vehicle implements Calculate{

    private String make;
    private String model;
    private String regType;
    private float regFee; 
    
    
    
    //Set Methods
    public void setMake(String ma){
    make = ma;
    }
    public void setModel(String mo){
    model = mo;
    }
    public void setRtype(String rt){
    regType = rt;
    } 
    public void setRfee(float rf){
    regFee = rf;
    }

    
    //Get Methods
    public String getMake(){
    return make;
    }
    public String getModel(){
    return model;
    }  

    public String getRtype(){
    return regType;
    }  
    
    
    public float getRfee(){  
    if (regType.equals("renew"))
        {
            regFee = 36;
        }
    else if (regType.equals("new"))
        {
            regFee = 58.50f;
        }         
    return regFee; 
    }   

    
}
