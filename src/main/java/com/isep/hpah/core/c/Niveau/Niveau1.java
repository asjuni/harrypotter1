package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;
import lombok.*;
@Getter@Setter


public class Niveau1 {

    public void combattre() {
        Scanner sc = new Scanner(System.in);

        // initialization of Wizard and troll's characteristics
        int wizardPower = 100;
        int trollPower = 10;

        // combat loop
        while (wizardPower > 0 && trollPower > 0) {

            System.out.println("\n=================================================================\nYou have three spells to inflict big damage to the troll:");
            System.out.println("1. Wingardium Leviosa");
            System.out.println("2. Aresto Momentum");
            System.out.println("3. Dentesaugmento");
            System.out.println("If the spell you cast among these three is one of the least influential, the troll may attack you.\n=================================================================\n");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            // if the Wizard casts the spell Wingardium Leviosa, he wins the combat
            if (choice == 1) {
                System.out.println("\n=====================\nThe Wizard casts the spell Wingardium Leviosa!\n");
                System.out.println("\nThe troll is lifted in the air and falls heavily to the ground.\n");
                System.out.println("\nThe Wizard wins the combat!\n=====================\n");
                trollPower = 0;
                System.out.println("\u001B[33mCongratulations, you have passed this level.Press ENTER to proceed to the next level.\n\n\u001B[0m");
                sc.nextLine();
                sc.nextLine();
            } else {
                // otherwise, the troll attacks and inflicts damage to the Wizard
                int damage = (int) (Math.random() * 10) + 1;
                System.out.println("\n=====================\nThe troll attacks the Wizard and inflicts " + damage + " points of damage\n=====================\n");
                wizardPower -= damage;
            }

            // if the troll is still alive, it attacks in turn
            if (trollPower > 0) {
                int damage = (int) (Math.random() * 6) + 1;
                System.out.println("\n=================================================================\nIt's the troll's turn. It attacks the Wizard and inflicts " + damage + " points of damage.\n=================================================================\n");
                wizardPower -= damage;
            }

            // display of remaining life points
            System.out.println("\n=====================\nRemaining life points:\n");
            System.out.println("Wizard: " + wizardPower );
            System.out.println("Troll: " + trollPower+ "\n=====================\n");
            System.out.println("\n");
        }

        // end of combat
        if (wizardPower <= 0) {
            System.out.println(".\n=====================\nThe troll has defeated the Wizard!.\n=====================\n");
        }
    }
}
