package com.capgemini.warriorlists;

import com.capgemini.warriorclasses.BaseFighter;

import java.util.ArrayList;
import java.util.List;

public class BaseFighterList {

    // Hier maak ik een ArrayList aan van een aantal vechters.
    public List<BaseFighter> fighters = new ArrayList<>();

    // Ik maak eem method aan om vechter toe te voegen aan mijn lijst.
    public void createfighters() {
        for (int i = 0; i < 13; i++) {
            BaseFighter fighter = new BaseFighter(true, 100, 80, 60, false);
            fighters.add(fighter);
        }
        // Hier wil ik de hele lijst printen nadat die is ontstaan.
        for (BaseFighter printOut : fighters)
            System.out.println(printOut);
    }
}

