package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;

public class Niveau6 {

    public void combattre() {
        Scanner sc = new Scanner(System.in);

        // initialization of Wizard and Death Eaters' characteristics
        int wizardPower = 100;
        int mangemortPower = 60;
        String playerHouse, joinEnemy, spell, target;

        System.out.print("Dans quelle maison êtes-vous ? ");
        playerHouse = sc.nextLine();

        // Check if the player is a Death Eater or not
        if (playerHouse.equalsIgnoreCase("Serpentard")) {
            System.out.print("Voulez-vous vous allier avec les Mangemorts ? ");
            joinEnemy = sc.nextLine();
            if (joinEnemy.equalsIgnoreCase("oui")) {
                System.out.println("Vous avez rejoint les Mangemorts. Fin du jeu.");
                return;
            } else {
                System.out.println("Vous avez choisi de ne pas vous allier avec les Mangemorts. Le combat commence !");
            }
        } else {
            System.out.println("Le combat commence !");
        }
        if (mangemortPower <= 0) {
            System.out.println("Félicitations ! Vous avez éliminé tous les Mangemorts et sauvé Poudlard !");
            System.out.println(".\n=====================\nRemaining life points:\n");
            System.out.println("Wizard: " + wizardPower );
            System.out.println("Détraqueurs: " + mangemortPower + ".\n=====================\n");
        }

        // The player must eliminate all the Death Eaters to win
        while (mangemortPower > 0) {
            System.out.print("Quel sort voulez-vous lancer ? ");
            spell = sc.nextLine();
            if (spell.equalsIgnoreCase("Sectumsempra")) {
                mangemortPower -= 20;
                System.out.println("Vous avez réussi à éliminer un Mangemort !");
            } else {
                System.out.println("Le sort n'a aucun effet sur l'ennemi.");
            }
            System.out.println("Il reste " + mangemortPower/20 + " Mangemorts. Qui voulez-vous viser ?");
            target = sc.nextLine();
            System.out.println("Vous avez visé " + target + ".");
        }

        System.out.println("Félicitations ! Vous avez éliminé tous les Mangemorts et sauvé Poudlard !");
        System.out.println("\u001B[33m\n=====================\nCongratulations, you have passed this level.\nPress ENTER to proceed to the next level.\n=====================\n\n\n\u001B[0m");
    }


}
