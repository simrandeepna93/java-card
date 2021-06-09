/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author SIMRANDEEP SINGH
 */
public class card {
    private String Suit ;
        private int Value;
public card (String s,int v)
{
    this.Suit=s;
    this.Value=v;
}
    /**
     * @return the suit
     */
    public String getSuit() {
        return Suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.Suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return Value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.Value = value;
    }
    }
    


    
    

