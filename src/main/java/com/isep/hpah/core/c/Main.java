package com.isep.hpah.core.c;

import com.isep.hpah.core.c.Niveau.Niveau1;
import com.isep.hpah.core.c.Niveau.Niveau2;
import com.isep.hpah.core.c.character.Wizard;
import com.isep.hpah.core.c.spells.Pet;

import java.util.ArrayList;
import java.util.Scanner;

import static com.isep.hpah.core.c.character.Character.basilic;
import static com.isep.hpah.core.c.character.Character.troll;

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

            System.out.println("\nWhat is the core of your wand?");

            Core wandCore = Core.chooseCore();


                System.out.println("What is its length?");
                int length = scanner.nextInt();

                if (length < 20) {

                    // Création d'un utilisateur avec ces choix
                    Wizard wizard = new Wizard(name, pet, new Wand(wandCore, length), new ArrayList<>(), new ArrayList<>());

                    // Assignation de résidence au hasard par le chapeau magique
                    SortingHat sortingHat = new SortingHat();


                    System.out.println("Your registration is complete!");

                    System.out.println((char) 27 + "[31m" + "\n BEGIN THE GAME " + (char) 27 + "[0m \n");
                    System.out.println("You have 8 magical potions in your possession, " +
                            "including 4 healing potions and 4 strength potions.\n");

                    Potion potion1 = new Potion("Healing", 4);
                    Potion potion2 = new Potion("Strength", 4);


                    // Débuter le jeu à partir du niveau 1
                    Level level = Level.getLevel(1);
                    System.out.println("Niveau " + level.getLevelNumber() + " : " +
                            level.getLocation());
                    System.out.println(level.getInstructions());

                }

                troll();

                Niveau1 niveau1 = new Niveau1();
                niveau1.combattre();

                Level level = Level.getLevel(2);
                System.out.println("Niveau " + level.getLevelNumber() + " : " +
                        level.getLocation());
                System.out.println(level.getInstructions());

                basilic();

                Niveau2.main(args);



            }
            }
        }
