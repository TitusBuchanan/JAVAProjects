package com.Dunegeon;

import com.Dunegeon.*;


import java.util.ArrayList;
import java.util.Arrays;


public class Simulator {
    private boolean criticalHit = false;
    private boolean criticalMiss = false;
    private int damage;
    private int attack;
    private int totalDamage;
    private Die twentySidedDie = new Die(20,1);
   public ArrayList<Player> newPlayers = new ArrayList<Player>();


    public Simulator(){
        this.damage = 0;
        this.attack = 0;
        this.criticalHit = false;
        this.criticalMiss = false;
        this.totalDamage = 0;
    }

    public int getAttack(int armourClass, int attackMod, int defenseMod, String damageDice) {




            String [] attackDice = damageDice.split("d");
            System.out.println(Arrays.toString(attackDice));
            int numberOfDice = Integer.parseInt(attackDice[0]);
            while (numberOfDice-- > 0){

                this.damage = this.twentySidedDie.hand();
                if(damage == 20) {
                    System.out.println("This was a critical Hit");
                    this.criticalHit = true;
                }

                if(this.damage == 1 ){
                    System.out.println("This is a special Negative");
                    this.criticalMiss = true;
                    this.damage = 0;
                }
                totalDamage += damage;
            }
            if (totalDamage < (armourClass + defenseMod)){
                System.out.println("Miss");
                return 0;
            }





        return totalDamage;
    }




}


