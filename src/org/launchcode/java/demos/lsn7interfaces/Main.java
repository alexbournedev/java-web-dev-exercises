package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        flavors.sort(new FlavorComparator());

        cones.sort(new ConeComparator());

        System.out.println("What's your favorite flavor?\n");

        for (int i = 0; i < flavors.size(); i++){
            System.out.println(flavors.get(i).getName());
        }

        System.out.println("--------------------------");
        System.out.println("Prices by cone selection:\n");

        for (int i = 0; i < cones.size(); i++){
            System.out.println(cones.get(i).getName() + " - $" + cones.get(i).getCost());
        }
    }
}