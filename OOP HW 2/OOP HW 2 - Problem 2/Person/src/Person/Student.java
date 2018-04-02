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
public class Student extends Person {
    
    protected String major;
    
    public void setMajor(String m){
    major = m;
    }
    
    public String getMajor (){
    return major;
    }
    
}
