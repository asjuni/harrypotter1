package com.isep.hpah.core.c;

import com.isep.hpah.core.c.Niveau.Niveau1;
import com.isep.hpah.core.c.Niveau.Niveau2;
import com.isep.hpah.core.c.Niveau.Niveau3;
import com.isep.hpah.core.c.Niveau.Niveau4;
import com.isep.hpah.core.c.character.Wizard;
import com.isep.hpah.core.c.spells.Pet;
import lombok.*;
import java.util.ArrayList;
import java.util.Scanner;

import static com.isep.hpah.core.c.character.Character.*;
@Getter@Setter
public class Main {

    public static void main(String[] args) {

        System.out.println("\n============================================================================================================================================\nWelcome to the magical world of Harry Potter! Dive \n" +
                "into the enchanting world of Hogwarts and experience unforgettable adventures \n" +
                "with Harry, Hermione and Ron! Explore magical worlds and fight against the forces of \n" +
                "evil to bring back peace and justice! Live a unique and exciting adventure, where you will \n" +
                "discover secrets and surprises around every corner!\n============================================================================================================================================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n============================================================================================================================================\nWelcome to the Harry Potter game! To begin, create your wizard: what is their name?\n============================================================================================================================================\n");

        String name = scanner.nextLine();

        if (name.length() >= 2 && name.length() <= 10) {

            Pet pet = Pet.choosePet();


            Core wandCore = Core.chooseCore();


                System.out.println("\n=====================\nWhat is its length?\n=====================\n");
                int length = scanner.nextInt();

                if (length < 20) {

                    // Création d'un utilisateur avec ces choix
                    Wizard wizard = new Wizard(name, pet, new Wand(wandCore, length), new ArrayList<>(), new ArrayList<>());

                    // Assignation de résidence au hasard par le chapeau magique
                    SortingHat sortingHat = new SortingHat();


                    System.out.println("\n=====================\nYour registration is complete!\n=====================\n");

                    System.out.println("\033[34m" + "==========================" + "\033[0m");
                    System.out.print("\033[34m" + "BEGIN THE GAME" + "\033[0m");
                    System.out.println("\033[34m" + "\n==========================" + "\033[0m");

                    System.out.println("\n=====================\nYou have 8 magical potions in your possession, " +
                            "including 4 healing potions and 4 strength potions.\n=====================\n");

                    Potion potion1 = new Potion("Healing", 4);
                    Potion potion2 = new Potion("Strength", 4);


                    // Débuter le jeu à partir du niveau 1
                    Level level = Level.getLevel(1);
                    System.out.println("\n=====================\nNiveau " + level.getLevelNumber() + " : \n=====================\n" +
                            level.getLocation());
                    System.out.println(level.getInstructions());

                }

                troll();

                Niveau1 niveau1 = new Niveau1();
                niveau1.combattre();

                Level level = Level.getLevel(2);
                System.out.println("\n=====================\nNiveau " + level.getLevelNumber() + " : \n=====================\n" +
                        level.getLocation());
                System.out.println(level.getInstructions());

                basilic();

            Niveau2 niveau2 = new Niveau2();
            niveau2.combattre();

            level = Level.getLevel(3);
            System.out.println("\n=====================\nNiveau " + level.getLevelNumber() + " : \n=====================\n" +
                    level.getLocation());
            System.out.println(level.getInstructions());

            detraqueur();

            Niveau3 niveau3 = new Niveau3();
            niveau3.combattre();

            level = Level.getLevel(4);
            System.out.println("\n=====================\nNiveau " + level.getLevelNumber() + " :\n=====================\n " +
                    level.getLocation());
            System.out.println(level.getInstructions());

            peter();

            Niveau4 niveau4 = new Niveau4();
            niveau4.combattre();

            }
            }
        }
