/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author lfv5020
 */
public class Instructor extends Person {
    
    protected double salary;
    
    public void setSalary (double s){
    salary = s;
    }
    
    public double getSalary(){
    return salary;
    
    }
    
}
