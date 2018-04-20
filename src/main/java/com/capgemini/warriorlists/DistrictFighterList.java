package com.capgemini.warriorlists;

import com.capgemini.warriorclasses.DistrictFighter;

import java.util.ArrayList;
import java.util.List;

public class DistrictFighterList {

    // Mijn lijst van de districtwarriors.
    public List<DistrictFighter> districtFighters = new ArrayList<>();

    int index = 1;
    // Hiermee kan ik een nummertje geven aan mijn districtwarrior in de command

    public void createdistfighters() {

        for (int i=0; i < 5; i++) {
            DistrictFighter fighter = new DistrictFighter(true, 100, 50, 70, false);
            districtFighters.add(fighter);
        }
        for (DistrictFighter printOut : districtFighters) {
                System.out.println("-------------------------------");
                System.out.println("Fighter " + index++);
                System.out.println("-------------------------------");
                System.out.println("Carreer Fighter stats");
                System.out.println("Health: " + printOut.healthPower);
                System.out.println("Attack: " + printOut.attackPower);
                System.out.println("Defense: " + printOut.defensePower);
            }

        }
    }

