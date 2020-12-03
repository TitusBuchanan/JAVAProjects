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

