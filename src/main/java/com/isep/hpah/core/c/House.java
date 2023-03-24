package com.isep.hpah.core.c;
import lombok.*;
@Getter@Setter
public class House {
    public static void main(String[] args) {
        maison();
    }
    public static void maison() {
        String[] houses = {"Gryffondor", "Poufsouffle", "Serpentard", "Serdaigle"};
        int randomHouseIndex = (int) (Math.random() * houses.length);
        System.out.println("\n==============================\nYou have been associated with " + houses[randomHouseIndex] + "\n==============================\n");
        System.out.println(" \uD83C\uDF86 \uD83C\uDF89 \uD83C\uDF8E \uD83C\uDF8A \uD83C\uDF83 \uD83C\uDF87 \n");
        if (houses[randomHouseIndex] == "Gryffondor\n\n") {
            System.out.println("\n==============================\nadvantage:" + "Gryffindor sorcerers are more resistant to damage. \n==============================\n");
        } else if (houses[randomHouseIndex] == "Poufsouffle\n\n") {
            System.out.println("\n==============================\nadvantage:" +"Potions are more effective for Hufflepuff members. \n==============================\n");
        } else if (houses[randomHouseIndex] == "Serpentard\n\n") {
            System.out.println("\n==============================\nadvantage:" +"Spells do more damage for Slytherin members. \n==============================\n");
        } else {
            System.out.println("\n==============================\nadvantage:" +"Ravenclaw wizards are more accurate.\n==============================\n");
        }
    }
}
