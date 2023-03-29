package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;
import lombok.*;

@Getter@Setter
public class Niveau4 {
    public void combattre() {
        Scanner sc = new Scanner(System.in);

        // initialization of Wizard and Peter Pettigrew's characteristics
        int wizardPower = 100;
        int peterPower = 30;
        // combat loop
        while (wizardPower > 0 && peterPower > 0) {

            // Wizard's turn
            System.out.println("\n=====================\nIt's the Wizard's turn.\n" +
                    "You have one spell to weaken Peter Pettigrew:\n" +
                    "1. Glacius \n\n" +
                    "2. Furunculus  \n\n" +
                    "3. Accio \n=====================\n");
            int choice = sc.nextInt();

            // if the Wizard casts the spell Accio, he wins the combat
            if (choice == 3) {
                System.out.println("\n=====================\nThe Wizard casts the spell Accio and draws the Portkey towards him!\n=====================\n");
                System.out.println("\n=====================\nThe Wizard wins the combat and escapes safely!\n=====================\n");
                peterPower = 0;
                System.out.println("\u001B[33m\n=====================\nCongratulations, you have passed this level.\nPress ENTER to proceed to the next level.\n=====================\n\n\n\u001B[0m");
                sc.nextLine();
                sc.nextLine();
                break;
            }

            // otherwise, the Wizard tries to weaken Peter Pettigrew
            else {
                int damage = (int)(Math.random() * 10) + 1;
                System.out.println("\n=====================\nThe Wizard casts the spell and inflicts " + damage + " points of damage.\n=====================\n");
                peterPower -= damage;
            }

            // Peter Pettigrew's turn
            if (peterPower > 0) {
                System.out.println("\n=====================\nIt's Peter Pettigrew's turn. He tries to attack the Wizard with his wand!\n=====================\n");

                // Peter Pettigrew's attack may fail if the Wizard casts the spell Expelliarmus
                if (choice == 1) {
                    System.out.println("\n=====================\nThe Wizard casts the spell Expelliarmus and disarms Peter Pettigrew!\n=====================\n");
                }
                else {
                    int damage = (int)(Math.random() * 8) + 1;
                    System.out.println("\n=====================\nPeter Pettigrew inflicts " + damage + " points of damage.\n=====================\n");
                    wizardPower -= damage;
                }
            }

            // display of remaining life points
            System.out.println("\n=====================\nRemaining life points:\n=====================\n");
            System.out.println("\n=====================\nWizard: " + wizardPower + "\n=====================\n");
            System.out.println("\n=====================\nPeter Pettigrew: " + peterPower + "\n=====================\n");
            System.out.println();
        }

        // end of combat
        if (wizardPower <= 0) {
            System.out.println("\n=====================\nPeter Pettigrew has defeated the Wizard!\n=====================\n");
        }
    }

}
