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
public class Volumes {

    public static void main(String[] args)    
    {
        Cube cube1 = new Cube(5);
        cube1.setSide(5);
        System.out.println("The volume is: " + cube1.calcVolume()); 
        
        SquareBox sb1 = new SquareBox();
        sb1.setSide(5);
        sb1.setHeight(10);
        System.out.println("The volume a square box with side " + sb1.getSide() + 
                           " and height " + sb1.getHeight() + " is: " + sb1.calcVolume());
        
    }
    
}
