/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.make.change;

/**
 *
 * @author kingk
 */
import java.util.Scanner;
public class HomeWorkMakeChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
        int price;
        int provided;
        int change = 0;
        System.out.print("Enter the purchase price:");
        price = (int) Math.round(keyboard.nextDouble() * 100);
        System.out.print("Enter the amount given by the customer:");

 

        provided = (int) Math.round(keyboard.nextDouble() * 100);
        
        if (provided > price) {
            System.out.println("The change is: " + ((provided - price)/100.00));
            System.out.println("The customer should be given the change as follows:");
            change = provided - price;
            
            int hundreds=change/10000;
            
            if(hundreds>0){
            change=change&100000;
            System.out.println(hundreds + " $100 bill(s)");
            }
            int fifties=change/5000;
            
            if(fifties>0){
            change=change%5000;
            System.out.println(fifties + " $50 bill(s)");
            }
   
            int twenties = change / 2000;
            
            if (twenties > 0) { 
                change = change % 2000; 
                System.out.println(twenties + " $20 bill(s)");
            }
            
            int tens = change / 1000;
            if (tens > 0) {
                change = change % 1000;
                System.out.println(tens + " $10 bill(s)");
            }
            
            int fives = change / 500;
            if (fives > 0) {
                change = change % 500;
                System.out.println(fives + " $5 bill(S)");
            }
            
            int ones = change / 100;
            if (ones > 0) {
                change = change % 100;
                System.out.println(ones + " $1 bill(s)");
            
            
            int half_dollar=change/50;
            if (half_dollar>0){
                change=change%50;
                System.out.println(half_dollar+ " half dollar(s)");
            }
            
            
            int quarters = change / 25;
            if (quarters > 0) {
                change = change % 25;
                System.out.println(quarters + " quarter coin(s)");
            }
            
            int dimes = change / 10;
            if (dimes > 0) {
                change = change % 10;
                System.out.println(dimes + " dime coin(s)");
            }
            
            int nickels = change / 5;
            if (nickels > 0) {
                change = change % 5;
                System.out.println(nickels + " nickel coin(s)");
            }
            int pennies = change;
            System.out.println(pennies + " penny coin(s)");
        }
        if (provided < price) { 
            System.out.print("Not enough money!");
        } else if (provided == price) { 
            System.out.print("No change is necessary!");
        }
    }
}
}   
    

