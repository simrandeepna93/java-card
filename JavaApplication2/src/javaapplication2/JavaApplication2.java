/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
/**
     * @param args the command line arguments
     */
/**
 *
 * @author SIMRANDEEP SINGH
 */
public class JavaApplication2 {
    public static void main(String args[])
            
    {
        card[] deck= new card[4];
        Scanner in =new Scanner (System.in);
        System.out.println("enter 4 cards:");
        for(int i=0;i<deck.length;i++)
    
    {
       // card S1=new card;
        //deck[i]=S1;
        deck [i]=new card(in.next(),in.nextInt());
        
    }
        System.out.println("enter 4 cards:");
        for(int i=0;i<deck.length;i++)
        {
            System.out.print(deck[i].getSuit()+" "+deck[i].getValue());
        }    
}
} /**
     * @param args the command line arguments
     */
   
       