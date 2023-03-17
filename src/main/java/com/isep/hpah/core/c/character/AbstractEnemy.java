package com.isep.hpah.core.c.character;

public abstract class abstractEnergy {
    public String enemy(int level) {
        switch (level) {
            case 1:
                return "Troll";
            case 2:
                return "Basilic";
            case 3:
                return "Détraqueurs";
            case 4:
                return "Voldemort et Peter Pettigrow";
            case 5:
                return "Dolores Ombrage";
            case 6:
                return "Mangemorts";
            case 7:
                return "Voldemort et Bellatrix Lestrange";
            default:
                return "";
        }
    }
}
