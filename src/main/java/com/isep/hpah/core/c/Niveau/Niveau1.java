package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;

import com.isep.hpah.core.c.Level;
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
            System.out.println(" \n It's the Wizard's turn.\n" +
                    " you have three spells to inflict big damage to the troll \n" +
                    "1. Wingardium Leviosa \n" +
                    "2. Avada Kedavra  \n" +
                    "3. Expelliarmus \n" +
                    "if the spell you cast among these three is one of the least influential, the troll may attack you \n\n");
            int choice = sc.nextInt();

            // if the Wizard casts the spell Wingardium Leviosa, he wins the combat
            if (choice == 2) {
                System.out.println("The Wizard casts the spell Wingardium Leviosa ! \n\n");
                System.out.println("The troll is lifted in the air and falls heavily to the ground.\n\n");
                System.out.println("The Wizard wins the combat! \n");
                trollPower = 0;
                System.out.println((char) 27 + "[33m" + "\n\n CONGRATULATIONS YOU HAVE PASSED THIS LEVEL. PRESS ENTER TO PROCEED TO THE NEXT LEVEL \n\n " + (char) 27 + "[0m");

            }
            // otherwise, the troll attacks and inflicts damage to the Wizard
            else {
                int damage = (int)(Math.random() * 10) + 1;
                System.out.println("The troll attacks the Wizard and inflicts " + damage + " points of damage. \n\n");
                wizardPower -= damage;
            }

            // if the troll is still alive, it attacks in turn
            if (trollPower > 0) {
                int damage = (int)(Math.random() * 6) + 1;
                System.out.println("It's the troll's turn. It attacks the Wizard and inflicts " + damage + " points of damage.\n\n");
                wizardPower -= damage;
            }

            // display of remaining life points
            System.out.println("Remaining life points:\n");
            System.out.println("Wizard: " +  wizardPower+ "\n");
            System.out.println("Troll: " + trollPower +"\n");
            System.out.println();
        }

        // end of combat
        if (wizardPower <= 0) {
            System.out.println(" \n\n The troll has defeated the Wizard! \n");
        }
    }
}
