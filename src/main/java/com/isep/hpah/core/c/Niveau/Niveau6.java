package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;

public class Niveau6 {

    public void combattre() {
        Scanner sc = new Scanner(System.in);

        // initialisation of Wizard and Death Eaters' characteristics
        int wizardPower = 100;
        int mangemotPower = 60;
        boolean defeatedMangemot = false;

        System.out.print("Which Hogwarts House are you in? \n");
        String playerHouse = sc.nextLine();

        // Check if the player is a Death Eater or not
        if (playerHouse.equalsIgnoreCase("Slytherin")) {
            System.out.print("Do you want to join the Death Eaters? ");
            String joinEnemy = sc.nextLine();
            if (joinEnemy.equalsIgnoreCase("yes")) {
                System.out.println("You have joined the Death Eaters. Game over.");
                return;
            } else {
                System.out.println("You have chosen not to join the Death Eaters. The battle begins!");
            }
        } else {
            System.out.println("The battle begins!");
        }

        while (!defeatedMangemot) {
            System.out.print("Which spell do you want to cast? ");
            String spell = sc.nextLine();

            if (spell.equalsIgnoreCase("Sectumsempra")) {
                mangemotPower -= 20;
                System.out.println("You have successfully eliminated a Death Eater!");
                if (mangemotPower <= 0) {
                    System.out.println("Congratulations! You have eliminated all the Death Eaters and saved Hogwarts!");
                    System.out.println(".\n=====================\nRemaining life points:\n");
                    System.out.println("Wizard: " + wizardPower);
                    System.out.println("Death Eaters: " + mangemotPower + ".\n=====================\n");
                    defeatedMangemot = true;
                } else {
                    System.out.println("There are " + mangemotPower / 20 + " Death Eaters left. Who do you want to target?");
                    String target = sc.nextLine();
                    System.out.println("You have targeted " + target + ".");
                }
            } else if (spell.equalsIgnoreCase("Expelliarmus") || spell.equalsIgnoreCase("Avada Kedavra")) {
                System.out.println("The spell has no effect on the enemy.");
            } else {
                System.out.println("The spell is not recognized. Try again!");
            }
        }
        System.out.println("\u001B[33mCongratulations, you have passed this level.Press ENTER to proceed to the next level.\n\n\u001B[0m");
    }
}
