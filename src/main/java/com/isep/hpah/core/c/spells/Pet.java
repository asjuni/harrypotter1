package com.isep.hpah.core.c.spells;
import lombok.*;
import java.util.Scanner;
@Getter
public enum Pet {
    CROCKDUR,
    HEDWIGE,
    PIGWIDGEON,
    SCABBERS,
    CROUTARD;

    public static Pet choosePet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choisir un animal parmi les 5 ?");
        System.out.println("1. CROCKDUR");
        System.out.println("2. HEDWIGE");
        System.out.println("3. PIGWIDGEON");
        System.out.println("4. SCABBERS");
        System.out.println("5. CROUTARD");
        int choice = scanner.nextInt();
        Pet pet;
        switch (choice) {
            case 1:
                pet = Pet.CROCKDUR;
                break;
            case 2:
                pet = Pet.HEDWIGE;
                break;
            case 3:
                pet = Pet.PIGWIDGEON;
                break;
            case 4:
                pet = Pet.SCABBERS;
                break;
            case 5:
                pet = Pet.CROUTARD;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
        return pet;
    }
}

