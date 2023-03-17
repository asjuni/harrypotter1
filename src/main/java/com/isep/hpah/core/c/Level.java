package com.isep.hpah.core.c;

public class Level {

    private int levelNumber;
    private String location;
    private String instructions;

    public Level(int levelNumber, String location, String instructions) {
        this.levelNumber = levelNumber;
        this.location = location;
        this.instructions = instructions;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public static Level getLevel(int levelNumber) {
        switch (levelNumber) {
            case 1:
                return new Level(1, "Toilettes du donjon", "Utiliser Wingardium Leviosa pour faire\n" +
                        "tomber des objets sur la tête du troll");
            case 2:
                return new Level(2, "Chambre des secrets", "Épée de Griffondor pour les Griffondor ;\n" +
                        "Croc du basilic avec Accio pour les\n" +
                        "autres");
            case 3:
                return new Level(3, "Lac dans la Forêt Interdite", "Utilisez votre Patronus ( Expecto\n" +
                        "Patronum) pour mettre les Détraqueurs\n" +
                        "en fuite !");
            case 4:
                return new Level(4, "Cimetière de Little Hangleton", "Vous devez vous rapprocher du\n" +
                        "Portolion, l’attirer à vous (accio) et\n" +
                        "vous enfuir.");
            case 5:
                return new Level(5, "Salle d’examen de Poudlard", "vous devez la combattre jusqu’à\n" +
                        "obtenir des feux d’artifice dans votre\n" +
                        "inventaire ; à ce moment-là, que la fête\n" +
                        "commence !");
            case 6:
                return new Level(6, "Tour d’astronomie", "Vous devez éliminer les Mangemorts\n" +
                        "qui ont tenté d’envahir Poudlard.\n" +
                        "Sectumsempra ! Si vous êtes membre\n" +
                        "de Serpentard, vous pouvez décider de\n" +
                        "vous allier avec les Mangemorts.");
            case 7:
                return new Level(7, "Poudlard", "Vous devez mettre hors d’état de\n" +
                        "nuire Voldemort et Bellatrix Lestrange.\n" +
                        "Attention aux avada kedavra. Dans\n" +
                        "le doute, expelliarmus ! Attention, si\n" +
                        "la baguette de Voldemort et votre\n" +
                        "baguette partagent le même cœur, il se\n" +
                        "passera des choses imprévisibles !");
            default:
                return null;
        }
    }
}



