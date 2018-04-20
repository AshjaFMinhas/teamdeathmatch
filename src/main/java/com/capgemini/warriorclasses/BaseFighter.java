package com.capgemini.warriorclasses;

// Mijn basefighters hebben de onderstaande eigenschappen.
public class BaseFighter {
    public boolean aliveOrDead = false;                 // true = alive / false = dead -> Instellen nog
    public int healthPower;
    public int attackPower;
    public int defensePower;
    public boolean fighterGender = false;               // true =  male / false = female -> Instellen nog

    // Constructor voor mijn BaseFighter.
    public BaseFighter(boolean aliveOrDead, int healthPower, int attackPower, int defensePower, boolean fighterGender) {
        this.aliveOrDead = aliveOrDead;
        this.healthPower = healthPower;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.fighterGender = fighterGender;
    }

    // Getters and Setters Alive or Dead
    public boolean isAliveOrDead() {
        return aliveOrDead;
    }
    // Hier wil ik graag een output als iemand leeft of dood is, daarom zo via if aangeven
    public String getAliveOrDead(boolean aliveOrDead) {
        this.aliveOrDead = aliveOrDead;

        if (aliveOrDead == false) {
            return "Alive";}
        else {
            return "Dead";
        }

    }
    // Getters and Setters health stat
    public int getHealthPower() {
        return healthPower;
    }

    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
    }
    // Getters and Setters attack stat
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    // Getters and Setters defense stat
    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }
    // Getters and Setters gender
    public boolean isFighterGender() {
        return fighterGender;
    }
    public String getFighterGender(boolean fighterGender) {
        this.fighterGender = fighterGender;

        // Ik wil een bepaalde output bij een gender
        if (fighterGender == false) {
            return "Male";
        }
            else {
            return "Female";
        }
    }
}

