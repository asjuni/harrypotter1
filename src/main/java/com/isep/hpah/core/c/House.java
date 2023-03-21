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
        System.out.println("You have been associated with " + houses[randomHouseIndex] + " \n");
        System.out.println(" \uD83C\uDF86 \uD83C\uDF89 \uD83C\uDF8E \uD83C\uDF8A \uD83C\uDF83 \uD83C\uDF87 \n");
        if (houses[randomHouseIndex] == "Gryffondor\n\n") {
            System.out.println("advantage:" + "Gryffindor sorcerers are more resistant to damage. \n");
        } else if (houses[randomHouseIndex] == "Poufsouffle\n\n") {
            System.out.println("advantage:" +"Potions are more effective for Hufflepuff members. \n");
        } else if (houses[randomHouseIndex] == "Serpentard\n\n") {
            System.out.println("advantage:" +"Spells do more damage for Slytherin members. \n");
        } else {
            System.out.println("advantage:" +"Ravenclaw wizards are more accurate. \n");
        }
    }
}
