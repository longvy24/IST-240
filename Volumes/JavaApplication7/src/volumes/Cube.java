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
public class Cube {
    
    protected double side;
    protected double volume;
    
    public Cube(){
    
    
    }
    
    public Cube(double s){
        side = s;
    }
    
    public void setSide(double s)
    {
        side = s;
    }
    
    public double getSide()
    {
        return side;
    
    }
    
    public double calcVolume()
    {
        volume = Math.pow(side, 3);
        return volume;
    }
    
    
}
