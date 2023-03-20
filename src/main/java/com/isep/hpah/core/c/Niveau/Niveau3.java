package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;

public class Niveau3 {

    public void combattre() {
        Scanner sc = new Scanner(System.in);

        // initialization of Wizard and Dementors' characteristics
        int wizardPower = 100;
        int dementorsPower = 20;
        // combat loop
        while (wizardPower > 0 && dementorsPower > 0) {
            System.out.println("\nIt's the Wizard's turn.\n" +
                    "You have one spell to defeat the Dementors:\n" +
                    "1.patronum restreint \n\n" +
                    "2.elipse \n\n" +
                    "3.Expecto Patronum \n\n");
            int choice = sc.nextInt();

            // if the Wizard casts the spell Expecto Patronum, he wins the combat
            if (choice == 3) {
                System.out.println("The Wizard casts the spell Expecto Patronum !\n\n");
                System.out.println("The Détraqueurs flee in terror.\n\n");
                System.out.println("The Wizard wins the combat!\n");
                dementorsPower = 0;
                System.out.println((char) 27 + "[33m" + "\n\nCONGRATULATIONS! YOU HAVE COMPLETED LEVEL 3. PRESS ENTER TO EXIT THE GAME." + (char) 27 + "[0m");
            }
            // otherwise, the Dementors attack and inflict damage to the Wizard
            else {
                int damage = (int)(Math.random() * 10) + 1;
                System.out.println("The Dementors attack the Wizard and inflict " + damage + " points of damage.\n\n");
                wizardPower -= damage;
            }

            // if the Dementors are still alive, they attack in turn
            if (dementorsPower > 0) {
                int damage = (int)(Math.random() * 8) + 1;
                System.out.println("It's the Détraqueurs' turn. They attack the Wizard and inflict " + damage + " points of damage.\n\n");
                wizardPower -= damage;
            }

            // display of remaining life points
            System.out.println("Remaining life points:\n");
            System.out.println("Wizard: " + wizardPower + "\n");
            System.out.println("Détraqueurs: " + dementorsPower + "\n");
            System.out.println();
        }

        // end of combat
        if (wizardPower <= 0) {
            System.out.println("\n\nThe Détraqueurs have defeated the Wizard!\n");
        }
    }
}

