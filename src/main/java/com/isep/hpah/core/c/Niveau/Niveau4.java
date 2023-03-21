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
            System.out.println("\nIt's the Wizard's turn.\n" +
                    "You have one spell to weaken Peter Pettigrew:\n" +
                    "1. Expelliarmus \n\n" +
                    "2. Stupefy \n\n" +
                    "3. Accio \n\n");
            int choice = sc.nextInt();

            // if the Wizard casts the spell Accio, he wins the combat
            if (choice == 3) {
                System.out.println("The Wizard casts the spell Accio and draws the Portkey towards him!\n\n");
                System.out.println("The Wizard wins the combat and escapes safely!\n");
                peterPower = 0;
                System.out.println((char) 27 + "[33m" + "\n\nCONGRATULATIONS! YOU HAVE COMPLETED LEVEL 4. PRESS ENTER TO EXIT THE GAME." + (char) 27 + "[0m");
                break;
            }

            // otherwise, the Wizard tries to weaken Peter Pettigrew
            else {
                int damage = (int)(Math.random() * 10) + 1;
                System.out.println("The Wizard casts the spell and inflicts " + damage + " points of damage.\n\n");
                peterPower -= damage;
            }

            // Peter Pettigrew's turn
            if (peterPower > 0) {
                System.out.println("It's Peter Pettigrew's turn. He tries to attack the Wizard with his wand!\n\n");

                // Peter Pettigrew's attack may fail if the Wizard casts the spell Expelliarmus
                if (choice == 1) {
                    System.out.println("The Wizard casts the spell Expelliarmus and disarms Peter Pettigrew!\n\n");
                }
                else {
                    int damage = (int)(Math.random() * 8) + 1;
                    System.out.println("Peter Pettigrew inflicts " + damage + " points of damage.\n\n");
                    wizardPower -= damage;
                }
            }

            // display of remaining life points
            System.out.println("Remaining life points:\n");
            System.out.println("Wizard: " + wizardPower + "\n");
            System.out.println("Peter Pettigrew: " + peterPower + "\n");
            System.out.println();
        }

        // end of combat
        if (wizardPower <= 0) {
            System.out.println("\n\nPeter Pettigrew has defeated the Wizard!\n");
        }
    }

}
