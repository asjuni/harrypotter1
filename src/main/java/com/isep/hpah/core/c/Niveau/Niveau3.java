package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;
import lombok.*;


@Getter@Setter
public class Niveau3 {

    public void combattre() {
        Scanner sc = new Scanner(System.in);

        // initialization of Wizard and Dementors' characteristics
        int wizardPower = 100;
        int dementorsPower = 20;
        // combat loop
        while (wizardPower > 0 && dementorsPower > 0) {
            System.out.println(".\n=====================\nIt's the Wizard's turn.\n" +
                    "You have one spell to defeat the Dementors:\n" +
                    "1.Flambios \n\n" +
                    "2.Ferula \n\n" +
                    "3.Expecto Patronum .\n=====================\n");
            int choice = sc.nextInt();

            // if the Wizard casts the spell Expecto Patronum, he wins the combat
            if (choice == 3) {
                System.out.println(".\n=====================\nThe Wizard casts the spell Expecto Patronum !.\n");
                System.out.println("The Détraqueurs flee in terror..");
                System.out.println("\nThe Wizard wins the combat!\n=====================\n");
                dementorsPower = 0;
                System.out.println("\u001B[33mCongratulations, you have passed this level.Press ENTER to proceed to the next level.\n\n\u001B[0m");
                sc.nextLine();
                sc.nextLine();
            }
            // otherwise, the Dementors attack and inflict damage to the Wizard
            else {
                int damage = (int)(Math.random() * 10) + 1;
                System.out.println("\n=====================\nThe Dementors attack the Wizard and inflict " + damage + " points of damage.\n=====================\n");
                wizardPower -= damage;
            }

            // if the Dementors are still alive, they attack in turn
            if (dementorsPower > 0) {
                int damage = (int)(Math.random() * 8) + 1;
                System.out.println("\n=====================\nIt's the Détraqueurs' turn. They attack the Wizard and inflict " + damage + " points of damage.\n=====================\n");
                wizardPower -= damage;
            }

            // display of remaining life points
            System.out.println(".\n=====================\nRemaining life points:\n");
            System.out.println("Wizard: " + wizardPower );
            System.out.println("Détraqueurs: " + dementorsPower + ".\n=====================\n");
            System.out.println();
        }

        // end of combat
        if (wizardPower <= 0) {
            System.out.println("\n=====================\nThe Détraqueurs have defeated the Wizard!\n=====================\n");
        }
    }
}

