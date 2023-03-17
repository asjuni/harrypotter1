package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;

import com.isep.hpah.core.c.House;
import com.isep.hpah.core.c.SortingHat;
import lombok.*;
public class Niveau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gagne = false;
        int wizardPower = 100;
        int basilicPower = 20;
        System.out.println("Bienvenue au combat contre le basilic !");
        System.out.print("Dans quelle maison êtes-vous ? \n\n");
        String maison = sc.nextLine();
        while (basilicPower > 0 && !gagne) { // Le niveau ne se termine que lorsque la vie du basilic est null
            System.out.println("C'est le tour du Wizard. \n\n");
            if (maison.equals("Gryffondor")) {
                System.out.println("Vous êtes un Gryffondor. Tapez '1 ou 2 ou 3 ' pour utiliser \n\n" +
                        "2 .l'Épée de Griffondor \n\n " +
                        "1. l'Épée de damoclesse \n\n" +
                        "3 . excalibure \n\n " +
                        "si vous utilisez la mauvaise arme le basilic vous attaquera.\n\n");
                int choix = sc.nextInt();
                if (choix == 2) {
                    System.out.println("Vous utilisez l'Épée de Griffondor !\n\n");
                    basilicPower -= 30; // Le basilic perd en point de vie
                    if (basilicPower <= 0) { // Si le basilic n'a plus de vie, le joueur gagne le combat
                        System.out.println("Vous réussissez à trancher la tête du basilic.\n\n");
                        System.out.println("Vous avez gagné le combat !\n\n");
                        gagne = true;
                    } else { // Sinon, le basilic attaque et inflige des dégâts au joueur
                        int degats = (int)(Math.random() * 30) + 1;
                        System.out.println("Le basilic attaque et vous inflige " + degats + " points de dégâts.\n\n");
                        wizardPower -= degats;
                        System.out.println("Remaining life points:\n");
                        System.out.println("Wizard: " + wizardPower + "\n");
                        System.out.println("basilic: " + basilicPower +"\n");
                        System.out.println();
                        if (wizardPower <= 0) { // Si le joueur n'a plus de vie, il perd le combat
                            System.out.println("Vous avez perdu le combat.\n\n");
                            break;
                        }
                    }
                } else {
                    int degats = (int)(Math.random() * 30) + 1;
                    System.out.println("Le basilic attaque et vous inflige " + degats + " points de dégâts.\n\n");
                    wizardPower -= degats;
                    System.out.println("Remaining life points:\n");
                    System.out.println("Wizard: " + wizardPower + "\n");
                    System.out.println("basilic: " + basilicPower +"\n");
                    System.out.println();
                    if (wizardPower <= 0) {
                        System.out.println("Vous avez perdu le combat.\n\n");
                        break;
                    }
                }
            } else {
                System.out.println("Vous êtes de la maison " + maison + ". Tapez '1' pour utiliser Croc du basilic avec Accio.\n\n");
                int choix = sc.nextInt();
                if (choix == 1) {
                    int degats = (int)(Math.random() *30 ) + 1;
                    basilicPower-= degats;
                    System.out.println("Vous utilisez Croc du basilic avec Accio !\n\n");
                    System.out.println("Vous réussissez à transpercer le cœur du basilic.\n\n");
                    System.out.println("Vous avez gagné le combat !\n\n");
                    gagne = true;

                    System.out.println("Remaining life points:\n");
                    System.out.println("Wizard: " + wizardPower + "\n");
                    System.out.println("basilic: " + basilicPower +"\n");
                    System.out.println();
                }
                // sinon, le basilic attaque et inflige des dégâts au joueur
                else {
                    int degats = (int)(Math.random() *30 ) + 1;
                    System.out.println("Le basilic attaque et vous inflige " + degats + " points de dégâts.\n\n");
                    wizardPower -= degats;
                    System.out.println("Remaining life points:\n");
                    System.out.println("Wizard: " + wizardPower + "\n");
                    System.out.println("basilic: " + basilicPower +"\n");
                    System.out.println();
                }

                // Si le basilic est encore en vie, il attaque à son tour
                if (basilicPower > 0 && !gagne) {
                    int degats = (int)(Math.random() * 30) + 1;
                    System.out.println("C'est le tour du basilic. Il attaque et vous inflige " + degats + " points de dégâts.\n\n");
                    basilicPower -= degats;
                    System.out.println("Remaining life points:\n");
                    System.out.println("Wizard: " + wizardPower + "\n");
                    System.out.println("basilic: " + basilicPower +"\n");
                    System.out.println();
                }
            }
        }
    }
}
