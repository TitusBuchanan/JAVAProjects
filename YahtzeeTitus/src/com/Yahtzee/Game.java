package com.Yahtzee;

import java.util.Random;

public class Game {
    private Random rand = new Random();


    public void StartGame() {


        YahtzeeConsole.welcome();
        Hand myHand = new Hand();
        myHand.roll(rand);
        for (var i = 0; i < 3; i++){
            if(i == 0){
                myHand.roll(rand);

            }
            else {
                myHand.roll(rand, YahtzeeConsole.getChoices());
            }
            YahtzeeConsole.displayHand(myHand.getDice());
        }
    }
}
