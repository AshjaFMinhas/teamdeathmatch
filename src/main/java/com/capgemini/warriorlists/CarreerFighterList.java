package com.capgemini.warriorlists;

import com.capgemini.warriorclasses.CarreerFighter;

import java.util.ArrayList;
import java.util.List;

public class CarreerFighterList {

    public List<CarreerFighter> fighters2 = new ArrayList<>();

    public void createfighters() {
        for (int i = 0; i < 10; i++) {
            CarreerFighter fighter = new CarreerFighter(true, 100, 40, 40, false);
            fighters2.add(fighter);
        }
    }
}


