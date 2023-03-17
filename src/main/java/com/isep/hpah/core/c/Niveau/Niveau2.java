package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;

import com.isep.hpah.core.c.House;
import com.isep.hpah.core.c.SortingHat;
import lombok.*;
public class Niveau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gagne = false;
// Initialisation de la vie du wizard en utilisant la valeur de la variable du niveau 1
        int wizardPower = 100;

        // initialisation des caractéristiques du basilic
        int basilicPower = 20;
    System.out.println("Bienvenue au combat contre le basilic !");
            System.out.print("Dans quelle maison êtes-vous ? \n\n");

            // Récupérer le nom de la maison du joueur
            String maison = sc.nextLine();

            // boucle de combat
            while (wizardPower > 0 && basilicPower > 0 && !gagne) {
            System.out.println("C'est le tour du Wizard. \n\n");

            // Si le joueur est un Gryffondor, il doit utiliser l'Épée de Griffondor pour vaincre le basilic
            if (maison.equals("Gryffondor")) {
            System.out.println("Vous êtes un Gryffondor. Tapez '1 ou 2 ou 3 ' pour utiliser \n\n" +
                    "2 .l'Épée de Griffondor \n\n " +
                    "1. l'Épée de damoclesse \n\n" +
                    "3 . excalibure \n\n " +
                    "si vous utiliser la mauvaise arme le basilic vous attaqueras .\n\n");

            int choix = sc.nextInt();

            // si le joueur utilise l'Épée de Griffondor, il gagne le combat
            if (choix == 2) {
            System.out.println("Vous utilisez l'Épée de Griffondor !\n\n");
            System.out.println("Vous réussissez à trancher la tête du basilic.\n\n");
            System.out.println("Vous avez gagné le combat !\n\n");
            gagne = true;
            }
            // sinon, le basilic attaque et inflige des dégâts au joueur
            else {
            int degats = (int)(Math.random() * 5) + 1;
            System.out.println("Le basilic attaque et vous inflige " + degats + " points de dégâts.\n\n");
            wizardPower -= degats;
            }
                System.out.println("Remaining life points:\n");
                System.out.println("Wizard: " + wizardPower + "\n");
                System.out.println("basilic: " + basilicPower +"\n");
                System.out.println();
            }
            // Pour les autres maisons, le joueur doit utiliser Croc du basilic avec Accio pour vaincre le basilic
            else {
            System.out.println("Vous êtes de la maison " + maison + ". Tapez '1' pour utiliser Croc du basilic avec Accio.\n\n");

            int choix = sc.nextInt();

            // si le joueur utilise Croc du basilic avec Accio, il gagne le combat
            if (choix == 1) {
            System.out.println("Vous utilisez Croc du basilic avec Accio !\n\n");
            System.out.println("Vous réussissez à transpercer le cœur du basilic.\n\n");
            System.out.println("Vous avez gagné le combat !\n\n");
            gagne = true;
            }
            // sinon, le basilic attaque et inflige des dégâts au joueur
            else {
            int degats = (int)(Math.random() *15 ) + 1;
            System.out.println("Le basilic attaque et vous inflige " + degats + " points de dégâts.\n\n");
            wizardPower -= degats;

                System.out.println("Remaining life points:\n");
                System.out.println("Wizard: " + wizardPower + "\n");
                System.out.println("basilic: " + basilicPower +"\n");
                System.out.println();
            }

            }

            // Si le basilic est encore en vie, il attaque à son tour
            if (basilicPower > 0 && !gagne) {
            int degats = (int)(Math.random() * 4) + 1;
            System.out.println("C'est le tour du basilic. Il attaque et vous inflige " + degats + " points de dégâts.\n\n");
            basilicPower -= degats;
            }


            }
    }
}


// Si le joueur a gagné, afficher

