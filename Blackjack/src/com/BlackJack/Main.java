package com.BlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


        public class Blackjack {
            private static int cash;//cash the user bets with
            private static int bet;//how much the user wants to bet
            private static int AceCounter;//how many aces are in the user's hand
            private static ArrayList<Card> hand;//represents the user's hand
            private static int handvalue;//the value of the user's hand
            private static String name;//name of the user
            public static void main(String[] args){
                System.out.println("Hi! What is your name?");
                Scanner scan = new Scanner(System.in);
                name = scan.nextLine();
                System.out.println("Hello, "+name+", lets play some BlackJack!");
                System.out.println("How much cash do you want to start with?");
                Scanner money = new Scanner(System.in);
                cash = money.nextInt();
                System.out.println("You start with cash: "+cash);
                while(cash>0){
                    Deck deck = new Deck();//initialize deck, dealer, hands, and set the bet.
                    deck.shuffle();
                    AceCounter=0;
                    Dealer dealer = new Dealer(deck);
                    List<Card> hand = new ArrayList<>();
                    hand.add(deck.drawCard());
                    hand.add(deck.drawCard());
                    System.out.println("How much would you like to bet?");
                    bet=Bet(cash);
                    System.out.println("Cash:"+(cash-bet));
                    System.out.println("Money on the table:"+bet);
                    System.out.println("Here is your hand: ");
                    System.out.println(hand);
                    int handvalue = calcHandValue(hand);
                    System.out.println("The dealer is showing: ");
                    dealer.showFirstCard();
                    if(hasBlackJack(handvalue) && dealer.hasBlackJack())//check if both the user and dealer have blackjack.
                    {
                        Push();
                    }
                    else if(hasBlackJack(handvalue))//check if the user has blackjack.
                    {
                        System.out.println("You have BlackJack!");
                        System.out.println("You win 2x your money back!");
                        cash=cash+bet;
                        Win();
                    }
                    else if(dealer.hasBlackJack())//check if the dealer has blackjack.
                    {
                        System.out.println("Here is the dealer's hand:");
                        dealer.showHand();
                        Lose();
                    }
                    else
                    {
                        if(2*bet<cash)//check if the user can double down.
                        {
                            System.out.println("Would you like to double down?");//allows the user to double down.
                            Scanner doubledown = new Scanner(System.in);
                            String doubled = doubledown.nextLine();
                            while(!isyesorno(doubled))
                            {
                                System.out.println("Please enter yes or no.");
                                doubled = doubledown.nextLine();
                            }
                            if(doubled.equals("yes"))
                            {
                                System.out.println("You have opted to double down!");
                                bet=2*bet;
                                System.out.println("Cash:"+(cash-bet));
                                System.out.println("Money on the table:"+bet);
                            }
                        }
                        System.out.println("Would you like to hit or stand?");//ask if the user will hit or stand
                        Scanner hitorstand = new Scanner(System.in);
                        String hitter = hitorstand.nextLine();
                        while(!isHitorStand(hitter))
                        {
                            System.out.println("Please enter 'hit' or 'stand'.");
                            hitter = hitorstand.nextLine();
                        }
                        while(hitter.equals("hit"))//hits the user as many times as he or she pleases.
                        {
                            Hit(deck, hand);
                            System.out.println("Your Hand is now:");
                            System.out.println(hand);
                            handvalue = calcHandValue(hand);
                            if(checkBust(handvalue))//checks if the user busted
                            {
                                Lose();
                                break;
                            }
                            if(handvalue<=21 && hand.size()==5)//checks for a five card trick.
                            {
                                fivecardtrick();
                                break;
                            }
                            System.out.println("Would you like to hit or stand?");
                            hitter = hitorstand.nextLine();
                        }