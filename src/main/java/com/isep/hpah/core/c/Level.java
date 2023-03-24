package com.isep.hpah.core.c;
import lombok.*;
@Getter @Setter
public class Level {

    private int levelNumber;
    private String location;
    private String instructions;

    public Level(int levelNumber, String location, String instructions) {
        this.levelNumber = levelNumber;
        this.location = location;
        this.instructions = instructions;
    }



    public static Level getLevel(int levelNumber) {
        switch (levelNumber) {
            case 1:
                return new Level(1, "\n=====================\nToilettes du donjon \n=====================\n", "\n=====================\n DEBUT  DU CHAPITRE 1 \n=====================\n ");
            case 2:
                return new Level(2, "\n=====================\nChambre des secrets \n=====================\n", " \n=====================\nDEBUT  DU CHAPITRE 2 \n=====================\n");
            case 3:
                return new Level(3, "\n=====================\nLac dans la Forêt Interdite\n=====================\n", "\n=====================\n DEBUT  DU CHAPITRE 3 \n=====================\n ");
            case 4:
                return new Level(4, "\n=====================\nCimetière de Little Hangleton\n=====================\n", "\n=====================\n DEBUT  DU CHAPITRE 4 \n=====================\n ");
            case 5:
                return new Level(5, "\n=====================\nSalle d’examen de Poudlard\n=====================\n", "\n=====================\n DEBUT  DU CHAPITRE 5 \n=====================\n ");
            case 6:
                return new Level(6, "\n=====================\nTour d’astronomie\n=====================\n", " \n=====================\nDEBUT  DU CHAPITRE 6 \n=====================\n ");
            case 7:
                return new Level(7, "\n=====================\nPoudlard\n=====================\n", "\n=====================\n DEBUT  DU CHAPITRE 7 \n=====================\n ");
            default:
                return null;
        }
    }
}



