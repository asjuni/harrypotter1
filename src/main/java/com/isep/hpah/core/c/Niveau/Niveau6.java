package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;

public class Niveau6 {

    public void combattre() {
        Scanner sc = new Scanner(System.in);

        // initialisation of Wizard and Death Eaters' characteristics
        int wizardPower = 100;
        int mangemotPower = 60;
        boolean defeatedMangemot = false;

        System.out.print("\n============================\nWhich Hogwarts House are you in? \n============================\n");
        String playerHouse = sc.nextLine();

        // Check if the player is a Death Eater or not
        if (playerHouse.equalsIgnoreCase("Slytherin")) {
            System.out.print("Do you want to join the Death Eaters? ");
            String joinEnemy = sc.nextLine();
            if (joinEnemy.equalsIgnoreCase("yes")) {
                System.out.println("You have joined the Death Eaters. Game over.");
                return;
            } else {
                System.out.println("\n============================\nYou have chosen not to join the Death Eaters. The battle begins!\n============================\n");
            }
        } else {
            System.out.println("\n============================\nThe battle begins!\n============================\n");
        }

        while (!defeatedMangemot) {
            System.out.print("\n============================\nWhich spell do you want to cast? \n============================\n");
            String spell = sc.nextLine();

            if (spell.equalsIgnoreCase("Sectumsempra")) {
                mangemotPower -= 20;
                System.out.println("\n============================\nYou have successfully eliminated a Death Eater!\n============================\n");
                if (mangemotPower <= 0) {
                    System.out.println("\n============================\nCongratulations! You have eliminated all the Death Eaters and saved Hogwarts!\n============================\n");
                    System.out.println(".\n=====================\nRemaining life points:\n");
                    System.out.println("Wizard: " + wizardPower);
                    System.out.println("Death Eaters: " + mangemotPower + ".\n=====================\n");
                    defeatedMangemot = true;
                } else {
                    System.out.println("\n============================\nThere are " + mangemotPower / 20 + " Death Eaters left. Who do you want to target?\n============================\n");
                    String target = sc.nextLine();
                    System.out.println("You have targeted " + target + ".");
                }
            } else if (spell.equalsIgnoreCase("Expelliarmus") || spell.equalsIgnoreCase("Avada Kedavra")) {
                System.out.println("\n============================\nThe spell has no effect on the enemy.\n============================\n");
            } else {
                System.out.println("\n============================\nThe spell is not recognized. Try again!\n============================\n");
            }
        }
        System.out.println("\u001B[33mCongratulations, you have passed this level.Press ENTER to proceed to the next level.\n\n\u001B[0m");
    }
}
