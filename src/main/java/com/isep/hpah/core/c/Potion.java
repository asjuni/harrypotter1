package com.isep.hpah.core.c;
import lombok.*;
import java.util.Scanner;
@Getter@Setter


public class Potion {

    private String name;
    private int quantite;

    public Potion(String name, int quantite) {
        this.name = name;
        this.quantite = quantite;
    }


    public void utiliserPotion() {
        Scanner sc = new Scanner(System.in);
        String choix = sc.nextLine();
        if (choix.equals("SOIN")) {
            if (this.quantite > 0) {
                System.out.println("Utiliser la potion \n " + this.name + " et reste " + (this.quantite - 1) + " potions \n");
                this.quantite--;
            } else {
                System.out.println("Potion \n" + this.name + " est épuisée \n");
            }
        } else if (choix.equals("FORCE")) {
            if (this.quantite > 0) {
                System.out.println("Utiliser la potion " + this.name + " et reste " + (this.quantite - 1) + " potions");
                this.quantite--;
            } else {
                System.out.println("Potion " + this.name + " est épuisée");
            }
        }
    }

}