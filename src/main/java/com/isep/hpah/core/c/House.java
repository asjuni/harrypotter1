package com.isep.hpah.core.c;

public class House {
    public static void main(String[] args) {
        maison();
    }
    public static void maison() {
        String[] houses = {"Gryffondor", "Poufsouffle", "Serpentard", "Serdaigle"};
        int randomHouseIndex = (int) (Math.random() * houses.length);
        System.out.println("Vous avez été associé à " + houses[randomHouseIndex]);
        System.out.println("\uD83C\uDF86 \uD83C\uDF89 \uD83C\uDF8E \uD83C\uDF8A \uD83C\uDF83 \uD83C\uDF87 \n");
        if (houses[randomHouseIndex] == "Gryffondor\n\n") {
            System.out.println("avantage :" + "Les sorciers de Gryffindor sont plus résistants aux dégâts.\n");
        } else if (houses[randomHouseIndex] == "Poufsouffle\n\n") {
            System.out.println("avantage :" +"Les potions sont plus efficaces pour les membres de Hufflepuff.\n");
        } else if (houses[randomHouseIndex] == "Serpentard\n\n") {
            System.out.println("avantage :" +"Les sorts font plus de dégâts pour les membres de Slytherin.\n");
        } else {
            System.out.println("avantage :" +"Les sorciers de Ravenclaw sont plus précis.\n");
        }
    }
}
