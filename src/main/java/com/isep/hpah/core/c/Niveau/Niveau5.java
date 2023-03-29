package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;
import lombok.*;
@Getter@Setter
public class Niveau5 {

    public void combattre() {
        Scanner sc = new Scanner(System.in);

        // initialization of Wizard and Dolores Ombrage's characteristics
        int wizardPower = 100;
        int ombragePower = 40;
        boolean feuxArtifice = false;

        // combat loop
        while (wizardPower > 0 && ombragePower > 0 && !feuxArtifice) {
            System.out.println("\n=====================\nIt's the Wizard's turn.\n" +
                    "You have one spell to attack Dolores Ombrage:\n" +
                    "1. Inanimatus Conjurus \n" +
                    "2. Locomotor Mortis\n" +
                    "3. Incendio\n" +
                    "=====================\n");
            int choice = sc.nextInt();

            // if the Wizard casts the spell Incendio, he has a chance of obtaining fireworks
            if (choice == 3) {
                int chance = (int)(Math.random() * 100) + 1;
                if (chance <= 50) {
                    System.out.println(".\n=====================\nThe Wizard casts the spell Incendio and obtains fireworks!.\n=====================\n");
                    feuxArtifice = true;
                } else {
                    System.out.println(".\n=====================\nThe spell didn't work, try again!.\n=====================\n");
                }
            }
            // otherwise, the Dolores Ombrage attacks and inflicts damage to the Wizard
            else {
                int damage = (int)(Math.random() * 10) + 1;
                System.out.println(".\n=====================\nDolores Ombrage attacks the Wizard and inflicts " + damage + " points of damage..\n=====================\n");
                wizardPower -= damage;
            }

            // if the Dolores Ombrage is still alive, she attacks in turn
            if (ombragePower > 0 && !feuxArtifice) {
                int damage = (int)(Math.random() * 8) + 1;
                System.out.println(".\n=====================\nIt's Dolores Ombrage's turn. She attacks the Wizard and inflicts " + damage + " points of damage..\n=====================\n");
                wizardPower -= damage;
            }

            // display of remaining life points
            System.out.println(".\n=====================\nRemaining life points:");
            System.out.println("\nWizard: " + wizardPower );
            System.out.println("Dolores Ombrage: " + ombragePower + ".\n=====================\n");
            System.out.println();
        }

        // end of combat
        if (wizardPower <= 0) {
            System.out.println("\n=====================\nDolores Ombrage has defeated the Wizard!\n=====================\n");
        } else if (feuxArtifice) {
            System.out.println("\n=====================\nYou obtained fireworks! Let the party begin!\n=====================\n");
        }
    }
}
