package com.capgemini.warriorclasses;

public class BaseFighter {
    public boolean aliveOrDead;
    public int healthPower;
    public int attackPower;
    public int defensePower;
    public boolean fighterGender;

    public BaseFighter(boolean aliveOrDead, int healthPower, int attackPower, int defensePower, boolean fighterGender) {
        this.aliveOrDead = aliveOrDead;
        this.healthPower = healthPower;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.fighterGender = fighterGender;
    }
    public boolean isAliveOrDead() {
        return aliveOrDead;
    }

    public void setAliveOrDead(boolean aliveOrDead) {
        this.aliveOrDead = aliveOrDead;
    }

    public int getHealthPower() {
        return healthPower;
    }

    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public boolean isFighterGender() {
        return fighterGender;
    }

    public void setFighterGender(boolean fighterGender) {
        this.fighterGender = fighterGender;
    }
}
