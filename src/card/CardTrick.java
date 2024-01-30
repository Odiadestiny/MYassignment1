/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author DestinyOdia
 * STUDENT NUMBER 991715771
 */

import java.util.Scanner;
import java.util.Random;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((random.nextInt(13)+1));
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            
            magicHand[i] = c;
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value: ");
        int val = scanner.nextInt();
        
        System.out.print("Enter your card suit between 0-3: ");
        int suit = scanner.nextInt();
        
        
        Card user_card = new Card();
        user_card.setValue(val);
        user_card.setSuit(Card.SUITS[suit]);
        
        boolean check = false;
        for (Card card : magicHand) {
            if (card.getValue() == user_card.getValue() && card.getSuit() == user_card.getSuit()) {
                check = true;
                break;
            }
        }
        
        if (check == true) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    
    }
    
}
