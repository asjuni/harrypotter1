package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;


public class Niveau7 {

    public void combattre() {
        Scanner sc = new Scanner(System.in);

        // initialization of Voldemort and Bellatrix's characteristics
        int wizardPower = 100;
        int voldemortPower = 200;
        int bellatrixPower = 100;
        boolean sameCore = false;
        boolean defeatedVoldemort = false;
        boolean defeatedBellatrix = false;

        // check if Voldemort and the Wizard share the same wand core
        System.out.println("\n=====================\nChecking Voldemort's wand core...\n");
        System.out.println("What is the core of your wand?");
        String wandCore = sc.nextLine();
        if (wandCore.equals("PHOENIX_FEATHER")) {
            sameCore = true;
        } else if (wandCore.equals("DRAGON_HEARTSTRING")) {
            sameCore = true;
        } else if (wandCore.equals("UNICORN_HAIR")) {
            sameCore = true;
        } else {
            sameCore = false;
        }

        // combat loop
        while (!defeatedVoldemort || !defeatedBellatrix) {
            System.out.println(".\n=====================\nIt's the Wizard's turn.\n" +
                    "You have two spells to defeat Voldemort and Bellatrix:\n" +
                    "1.Expelliarmus \n\n" +
                    "2.Avada Kedavra \n=====================\n");
            int choice = sc.nextInt();

            // if the Wizard casts the spell Avada Kedavra and the wand cores are different, he wins the combat against Voldemort
            if (choice == 2 && !sameCore) {
                System.out.println(".\n=====================\nThe Wizard casts the spell Avada Kedavra !.\n");
                System.out.println("Voldemort falls to the ground, lifeless..");
                System.out.println("\nThe Wizard has defeated Voldemort!\n=====================\n");
                voldemortPower = 0;
                defeatedVoldemort = true;
            }
            // if the Wizard casts the spell Expelliarmus, he disarms Bellatrix
            else if (choice == 1) {
                System.out.println(".\n=====================\nThe Wizard casts the spell Expelliarmus !.\n");
                System.out.println("Bellatrix's wand flies out of her hand..");
            }
            // otherwise, the Wizard loses the combat
            else {
                System.out.println(".\n=====================\nThe Wizard casts the spell Avada Kedavra but the wand cores are the same!.\n");
                System.out.println("The spell backfires and hits the Wizard..");
                System.out.println("\nThe Wizard is dead!\n=====================\n");
                return;
            }

            // if Bellatrix is disarmed, she is defeated
            if (!defeatedBellatrix && !sameCore) {
                System.out.println("\n=====================\nIt's Bellatrix's turn. She tries to recover her wand but fails.\n=====================\n");
                defeatedBellatrix = true;
            }
            // otherwise, Bellatrix attacks and inflicts damage to the Wizard
            else if (!defeatedBellatrix) {
                int damage = (int)(Math.random() * 10) + 1;
                System.out.println("\n=====================\nIt's Bellatrix's turn. She casts a curse and inflicts " + damage + " points of damage.\n=====================\n");
                voldemortPower -= damage;
            }

            // if Voldemort is still alive, he attacks in turn
            if (!defeatedVoldemort) {
                if (sameCore) {
                    System.out.println("\n=====================\nIt's Voldemort's turn. He casts the Killing Curse and hits the Wizard without even saying the incantation.\n=====================\n");
                    System.out.println("\nThe Wizard is");
// if Voldemort is still alive, he attacks in turn
                    if (voldemortPower > 0) {
                        int damage = (int)(Math.random() * 12) + 1;
                        System.out.println("\n=====================\nIt's Voldemort's turn. He attacks the Wizard and inflicts " + damage + " points of damage.\n=====================\n");
                        wizardPower -= damage;
                    }
                    // if Bellatrix is still alive, she attacks in turn
                    if (bellatrixPower > 0) {
                        int damage = (int)(Math.random() * 10) + 1;
                        System.out.println("\n=====================\nIt's Bellatrix Lestrange's turn. She attacks the Wizard and inflicts " + damage + " points of damage.\n=====================\n");
                        wizardPower -= damage;
                    }

                    // display of remaining life points
                    System.out.println(".\n=====================\nRemaining life points:\n");
                    System.out.println("Wizard: " + wizardPower );
                    System.out.println("Voldemort: " + voldemortPower );
                    System.out.println("Bellatrix Lestrange: " + bellatrixPower + ".\n=====================\n");
                    System.out.println();
                }

                // end of combat
                if (wizardPower <= 0) {
                    System.out.println("\n=====================\nVoldemort and Bellatrix Lestrange have defeated the Wizard!\n=====================\n");
                }
            }
        }
    }
}