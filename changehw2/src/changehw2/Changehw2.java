/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changehw2;

/**
 *
 * @author kingk
 */
import java.util.Scanner;
public class Changehw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        int amount; // declare amount
                // Create a Scanner object for keyboard input.
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter amount : "); // print message
            amount = keyboard.nextInt(); // read amount
            change(amount); // call method
    }
      public static void change(int amount){ // method change() that accepts amount
                int hundreds, fifties, twenties, tens, fives, ones; // declare variables
                hundreds = amount/100; // divide amount by 100 to find hundreds
                amount = amount % 100; // removes 100s using mod operator
                fifties = amount/50;  // divide amount by 50 to find fifties
                amount = amount%50; // removes 50s using mod operator
                twenties = amount/20;  // divide amount by 20 to find twenties
                amount = amount%20; // removes 20s using mod operator
                tens = amount/10;  // divide amount by 10 to find tens
                amount = amount%10; // removes 10s using mod operator
                fives = amount / 5; // divide amount by 5 to find fives
                amount = amount%5; // removes 5s using mod operator
                ones = amount;  // remaining value will be ones
                
                System.out.println("Hundreds : " + hundreds); // print hundreds
                System.out.println("Fifties : " + fifties);  // print fifties
                System.out.println("Twenties : " + twenties); // print twenties
                System.out.println("Tens : " + tens); // print tens
                System.out.println("Fives : " + fives); // print fives
                System.out.println("Ones : " + ones); // print ones
        }
}
