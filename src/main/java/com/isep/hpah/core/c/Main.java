package com.isep.hpah.core.c;

import com.isep.hpah.core.c.Niveau.Niveau1;
import com.isep.hpah.core.c.Niveau.Niveau2;
import com.isep.hpah.core.c.character.Wizard;
import com.isep.hpah.core.c.spells.Pet;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the magical world of Harry Potter! Dive \n" +
                "into the enchanting world of Hogwarts and experience unforgettable adventures \n" +
                "with Harry, Hermione and Ron! Explore magical worlds and fight against the forces of \n" +
                "evil to bring back peace and justice! Live a unique and exciting adventure, where you will \n" +
                "discover secrets and surprises around every corner!\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Harry Potter game! To begin, create your wizard: what is their name?");

        String name = scanner.nextLine();

        if (name.length() >= 2 && name.length() <= 10) {
            Pet pet = Pet.choosePet();

            System.out.println("\n" +
                    "What is the core of your wand?");

            String core = scanner.nextLine();

            if (core.length() >= 2 && core.length() <= 20) {
                System.out.println("What is its length?");

                int length = scanner.nextInt();

                if (length > 0) {
                    // Création d'un utilisateur avec ces choix

                    Wizard wizard = new Wizard(name, pet, new Wand(core, length), new ArrayList<>(), new ArrayList<>());

                    // Assignation de résidence au hasard par le chapeau magique

                    SortingHat sortingHat = new SortingHat();

                    System.out.println("votre inscription est bien achever ");

                    System.out.println((char) 27 + "[31m" + "\n DEBUT DU JEU " + (char) 27 + "[0m");
                    System.out.println("vous avez en votre possession 8 potion magique \n" +
                            "dont 4 potion de soin et 4 potion de force \n");

                    Potion potion1 = new Potion("Soin", 4);
                    Potion potion2 = new Potion("force", 4);
                    potion1.utiliserPotion();

                    // Débuter le jeu à partir du niveau 1
                    Level level = Level.getLevel(1);
                    System.out.println("Niveau " + level.getLevelNumber() + " : " +
                            level.getLocation());
                    System.out.println(level.getInstructions());

                }

                Niveau1 niveau1 = new Niveau1();
                niveau1.combattre();

                Level level = Level.getLevel(2);
                System.out.println("Niveau " + level.getLevelNumber() + " : " +
                        level.getLocation());
                System.out.println(level.getInstructions());

                Niveau2.main(args);



            }
        }
    }
}
