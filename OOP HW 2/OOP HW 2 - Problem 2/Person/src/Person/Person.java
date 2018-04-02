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
public class Person {

    protected String name;
    protected String birthYear;
    
    
 public void setName(String n){
 name = n;
 }
 
 public void setYear(String y){
 birthYear = y;
 }
 
 public String getName (){
 return name;
 }
 
 public String getYear(){
 return birthYear;
 }
    
}
