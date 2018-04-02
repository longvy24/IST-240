/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumes;

/**
 *
 * @author lfv5020
 */
public class SquareBox extends Cube{

    protected double height;
    
    public SquareBox(){
    
    
    }
    
    public SquareBox(double s, double h){
        super(s);
        side = s;
        height = h;
        
    }
    
    public void setHeight (double h){
    height = h;   
        
    }
    
    public double getHeight(){
     
        return height;
    }
    
    /**
     *
     * @return
     */

    @Override
    public double calcVolume(){
        volume = side * side * height;
        return volume;
    }
    
    
    
    }
    

