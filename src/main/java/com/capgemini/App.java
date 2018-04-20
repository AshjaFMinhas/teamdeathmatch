package com.capgemini;

import com.capgemini.warriorlists.CarreerFighterList;
import com.capgemini.warriorlists.DistrictFighterList;

public class App {
    public static void main(String[] args) {

        // Ik roep hier de methode createfighters aan, zodat er fighters worden geprint.
        CarreerFighterList carreerFighterList = new CarreerFighterList();
        carreerFighterList.createfighters();

        // Ik roep hier de methode districtfighers aan, zodat er fighters worden geprint.
        DistrictFighterList districtFighterList = new DistrictFighterList();
        districtFighterList.createdistfighters();

    }







}




