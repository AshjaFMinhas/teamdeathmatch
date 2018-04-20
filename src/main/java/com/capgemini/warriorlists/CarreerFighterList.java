package com.capgemini.warriorlists;

import com.capgemini.warriorclasses.CarreerFighter;

import java.util.ArrayList;
import java.util.List;

public class CarreerFighterList {

    public List<CarreerFighter> fighters = new ArrayList<>();

    int index = 1;

    // Ik maak hier een loop waarbij elke er fighters worden gemaakt. Hij maakt 10 fighters en telt elke keer eentje op.
    public void createfighters() {

        for (int i = 0; i < 10; i++) {
            /*double randomDouble = Math.random() * 50;
            System.out.println(randomDouble);*/
            CarreerFighter fighter = new CarreerFighter(true, 100 + i, 40 + i, 40 - i, false);
            fighters.add(fighter);
        }
        // Hier wil ik voor de hele lijst laten printen. Ik gebruik hier de warrior statistieken.
        for (CarreerFighter printOut : fighters) {
            System.out.println("------------------------------------");
            System.out.println("Fighter " + index++);
            System.out.println("------------------------------------");
            System.out.println("Carreer Fighter stats");
            System.out.println("Current status: " + printOut.getAliveOrDead(printOut.aliveOrDead));
            System.out.println("Health: "+ printOut.getHealthPower());
            System.out.println("Attack: "+ printOut.getAttackPower());
            System.out.println("Defense: "+ printOut.getDefensePower());
            System.out.println("Gender: " + printOut.getFighterGender(printOut.fighterGender));

        }
    }
}


