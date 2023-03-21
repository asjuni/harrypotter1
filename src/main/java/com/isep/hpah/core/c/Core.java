package com.isep.hpah.core.c;

import java.util.Scanner;
import lombok.*;
@Getter
public enum Core {
    PHOENIX_FEATHER,
    DRAGON_HEARTSTRING,
    UNICORN_HAIR;

    public static Core chooseCore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a wand core:");
        System.out.println("1. PHOENIX_FEATHER");
        System.out.println("2. DRAGON_HEARTSTRING");
        System.out.println("3. UNICORN_HAIR");

        int choice = scanner.nextInt();
        Core core;
        switch (choice) {
            case 1:
                core = Core.PHOENIX_FEATHER;
                break;
            case 2:
                core = Core.DRAGON_HEARTSTRING;
                break;
            case 3:
                core = Core.UNICORN_HAIR;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
        return core;
    }
}