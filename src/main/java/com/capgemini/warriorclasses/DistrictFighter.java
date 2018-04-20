package com.capgemini.warriorclasses;

public class DistrictFighter extends BaseFighter {

    public DistrictFighter(boolean aliveOrDead, int healthPower, int attackPower, int defensePower, boolean fighterGender) {
        super(aliveOrDead, healthPower, attackPower, defensePower + 20, fighterGender);
        // De DistrictFighter krijgt een defense boost van 20!


    }
}







