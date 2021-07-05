/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changehw;

/**
 *
 * @author kingk
 */
import java.util.Scanner;
public class ChangeHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereint price;
        int amount;
               
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter amount : "); 
            amount = keyboard.nextInt(); 
            change(amount); 
    }
    public static void change (int amount){
        int hundreds,fifties,twenties,tens,fives,ones;
        //int money = 0;
       hundreds= amount/100;
            
            if(hundreds>0){
            amount=amount%100;
            System.out.println(hundreds + " $100 bill(s)");
            }
            
       fifties=amount/50;
            
            if(fifties>0){
            amount= amount % 50;
            System.out.println(fifties + " $50 bill(s)");
            }
   
       twenties = amount/ 20;
            
            if (twenties > 0) { 
                amount = amount % 20; 
                System.out.println(twenties + " $20 bill(s)");
            }
            
       tens = amount / 10;
            
            if (tens > 0) {
                amount= amount % 10;
                System.out.println(tens + " $10 bill(s)");
            }
            
       fives = amount / 5;
            
            if (fives > 0) {
                amount = amount % 5;
                System.out.println(fives + " $5 bill(S)");
            }
            
       ones = amount;
             System.out.println(ones + " $1 bill(s)");
}
        }




   