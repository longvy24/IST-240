/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Long
 */
public class Income {
    
    private double income;
    private double taxDue;
    
    public Income(double t, double i){
        
    taxDue = t;
    income = i;
        
        }
       
    public void setIncome(double i){
    
        income = i;
    
    }
    
    public double calTaxDue(double t){
          if (income > 0 && income <= 50000)  
        {
            taxDue = (income *.05);
        }
    else if (income >= 50001 && income <= 100000) 
        {
            taxDue = (2500 + income*.1);
        }
    else if (income >= 100001)       
        {
            taxDue = (7500 + income * .15);
        }  
          
        return taxDue;
    }
        
      
    public double getIncome()
    {
    return income;
    }

   
    
    
    
    
}
