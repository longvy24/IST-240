/*
For this program, create a class called Customer with attributes income and taxDue.
It should also have a set method for income, and a calcTax()
method to assign taxDue and return it.
The tax is calculated as follows:
Income: $0 - $50,000 ----    Tax Due:  5%
        $50,000 - $100,000             $2,500 + 10% of( income > $50,00)
        > $100,000           Tax Due   $7,500 + 15% (income > $100,000)

Create a Customer object in main, have the user enter
the income and assign this to the income
variable of the Customer object,
and then call calcTax for the Customer 
object and print the tax due.
 */
package Customer;
import java.util.Scanner;
import java.text.DecimalFormat;


/**
 *
 * @author lfv5020
 */


public class Customer {

    static double taxDue;

    public static void main(String[] args) {
            
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Please enter your income: ");
    double income = sc.nextDouble();
    
   
    Income s1 = new Income(taxDue, income);
    
     System.out.println("Your income: " + s1.getIncome() + "\nYour Tax Due: " + s1.calTaxDue());
    
     /*
    if (income > 0 && income <= 50000)  /*0-50,000
        {
            taxDue = (income *.05);
           
        }
    else if (income >= 50001 && income <= 100000) /*50,000 - 100,000
        {
            taxDue = (2500 + income*.1);
            System.out.println("Your income: " + income + "\nYour Tax Due:" + df2.format(taxDue));
        }
    else if (income >= 100001)       /* 100,000 >
        {
            taxDue = (7500 + income * .15);
            System.out.println("Your income: " + income + "\nYour Tax Due:" + df2.format(taxDue));
        }
    else
        {
            System.out.println("Please enter a valid income.");
        }
        */
    
    
    
    
    }    
}
