/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidhw;

import java.util.Scanner;

/**
 *
 * @author kingk
 */
public class LiquidHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalcups;
               
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter amount : "); 
            totalcups = keyboard.nextInt(); 
            liquid(totalcups); 
    }
    
    
    public static void liquid(int totalcups){
    int gallons, quarts, pints ,cups; 
     
    gallons= totalcups/16;
    //totalcups=totalcups%16;
    
    quarts=(totalcups%16)/4;
    //totalcups=totalcups%4;
    
    pints=((totalcups%16)%4)/2;
    //totalcups=totalcups%2;
    
    cups=((totalcups%16)%4)%2;
    
    
    
    System.out.println("Gallons: " + gallons); // print gallons
    System.out.println("Quarts : " + quarts);  // print quartz
    System.out.println("Pints : " + pints); // print pints
    System.out.println("Cups : " + cups); // print cups
               
     
     
    }
}
