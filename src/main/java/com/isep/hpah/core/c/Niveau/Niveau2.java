package com.isep.hpah.core.c.Niveau;

import java.util.Scanner;

import lombok.*;


@Getter@Setter
public class Niveau2 {
    public void combattre() {
        Scanner sc = new Scanner(System.in);
        boolean gagne = false;
        int wizardPower = 100;
        int basilicPower = 20;
        System.out.println("\n=====================");
        System.out.println("     Wizard's turn");
        System.out.println("=====================\n");

        System.out.println("\n=====================\nBienvenue au combat contre le basilic !\n=====================\n");
        System.out.print("\n=====================\nDans quelle maison êtes-vous ? \n=====================\n");
        String maison = sc.nextLine();
        while (basilicPower > 0 && !gagne) {
           // Le niveau ne se termine que lorsque la vie du basilic est null
            System.out.println("\n=====================\nC'est le tour du Wizard.\n=====================\n");
            if (maison.equals("Gryffondor")) {
                System.out.println("\n=====================\nVous êtes un Gryffondor. Tapez '1 ou 2 ou 3 ' pour utiliser \n" +
                        "1.l'Épée de damoclesse \n" +
                        "2.l'Épée de Griffondor \n " +
                        "3.excalibure \n" +
                        "si vous utilisez la mauvaise arme le basilic vous attaquera.\n=====================\n");
                int choix = sc.nextInt();
                if (choix == 2) {
                    System.out.println("\n=====================\nVous utilisez l'Épée de Griffondor !\n=====================\n");
                    basilicPower -= 30; // Le basilic perd en point de vie
                    if (basilicPower <= 0) { // Si le basilic n'a plus de vie, le joueur gagne le combat
                        System.out.println("\n=====================\nVous réussissez à trancher la tête du basilic.\n=====================\n");
                        System.out.println("\n=====================\nVous avez gagné le combat !\n=====================\n");
                        gagne = true;
                        System.out.println("\u001B[33mCongratulations, you have passed this level.Press ENTER to proceed to the next level.\n\n\u001B[0m");
                        sc.nextLine();
                        sc.nextLine();
                    } else { // Sinon, le basilic attaque et inflige des dégâts au joueur
                        int degats = (int)(Math.random() * 30) + 1;
                        System.out.println("\n=====================\nLe basilic attaque et vous inflige " + degats + " points de dégâts.\n=====================\n");
                        wizardPower -= degats;
                        System.out.println("\n=====================\nRemaining life points:\n=====================\n");
                        System.out.println("\n=====================\nWizard: " + wizardPower + "\n=====================\n");
                        System.out.println("\n=====================\nbasilic: " + basilicPower +"\n=====================\n");
                        System.out.println();
                        if (wizardPower <= 0) { // Si le joueur n'a plus de vie, il perd le combat
                            System.out.println("\n=====================\nVous avez perdu le combat.\n=====================\n");
                            break;
                        }
                    }
                } else {
                    int degats = (int)(Math.random() * 30) + 1;
                    System.out.println("\n=====================\nLe basilic attaque et vous inflige " + degats + " points de dégâts.\n=====================\n");
                    wizardPower -= degats;
                    System.out.println(".\n=====================\nWizard: " + wizardPower + ".\n=====================\n");
                    System.out.println(".\n=====================\nbasilic: " + basilicPower +".\n=====================\n");
                    System.out.println();
                    if (wizardPower <= 0) {
                        System.out.println(".\n=====================\nVous avez perdu le combat..\n=====================\n");
                        break;
                    }
                }
            } else {
                System.out.println(".\n=====================Vous êtes de la maison " + maison + ". Tapez" +
                        "1.Croc du basilic avec Accio\n" +
                        "2.Dentes diminuendo\n" +
                        "3.Evanesco \n=====================\n");
                int choix = sc.nextInt();
                  if(choix == 1) {
                    int degats = (int)(Math.random() *30 ) + 1;
                    basilicPower-= degats;
                    System.out.println(".\n=====================\nVous utilisez Croc du basilic avec Accio !.\n=====================\n");
                    System.out.println(".\n=====================\nVous réussissez à transpercer le cœur du basilic..\n=====================\n");
                    System.out.println(".\n=====================\nVous avez gagné le combat !.\n=====================\n");
                    gagne = true;

                    System.out.println("Remaining life points:\n");
                    System.out.println("Wizard: " + wizardPower + "\n");
                    System.out.println("basilic: " + basilicPower +"\n");
                    System.out.println();
                }
                // sinon, le basilic attaque et inflige des dégâts au joueur
                else {
                    int degats = (int)(Math.random() *30 ) + 1;
                    System.out.println(".\n=====================\nLe basilic attaque et vous inflige " + degats + " points de dégâts..\n=====================\n");
                    wizardPower -= degats;

                }

                // Si le basilic est encore en vie, il attaque à son tour
                if (basilicPower > 0 && !gagne) {
                    int degats = (int)(Math.random() * 30) + 1;
                    System.out.println(".\n=====================\nC'est le tour du basilic. Il attaque et vous inflige " + degats + " points de dégâts..\n=====================\n");
                    basilicPower -= degats;
                    System.out.println(".\n=====================\nRemaining life points:.\n=====================\n");
                    System.out.println(".\n=====================\nWizard: " + wizardPower + ".\n=====================\n");
                    System.out.println(".\n=====================\nbasilic: " + basilicPower +".\n=====================\n");
                    System.out.println();
                }
            }
        }
    }
}
