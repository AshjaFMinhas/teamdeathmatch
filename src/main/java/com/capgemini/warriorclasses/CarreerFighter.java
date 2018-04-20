package com.capgemini.warriorclasses;

public class CarreerFighter extends BaseFighter {

    public CarreerFighter(boolean aliveOrDead, int healthPower, int attackPower, int defensePower, boolean fighterGender) {
        super(aliveOrDead, healthPower, attackPower + 20, defensePower, fighterGender);
        // De CarreerFighter krijgt een attackboost van 20.

    }


}




