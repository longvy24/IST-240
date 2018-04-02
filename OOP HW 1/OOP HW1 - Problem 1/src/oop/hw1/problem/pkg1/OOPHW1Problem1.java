/*
 Write a program that has the user input their height in inches and convert it to meters. 
Print the inches and the converted meters. 
The program should allow the user to enter as many heights as they want (use a loop for this).
 */
package oop.hw1.problem.pkg1;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author lfv5020
 */
public class OOPHW1Problem1 {

    private static DecimalFormat df2 = new DecimalFormat(".##");
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double height;
        double meters;        
  do
    {
        System.out.print("Please enter your height in inches (Enter 0 to exit): ");
        height = sc.nextInt();
        meters = (float) (height * .0254); 
        
        if(height > 0)
        {
            System.out.println("Your height is " + height + " in");
            System.out.println("Your height in meters is " + df2.format(meters) 
            + " m");
        }
        else if (height < 0)
        {
            System.out.println("Please enter a valid height value.");
        }
    } while(height!=0);
        
        
        
        
        
        
        
    }
    
}
