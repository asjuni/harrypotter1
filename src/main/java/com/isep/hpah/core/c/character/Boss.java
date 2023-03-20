package com.isep.hpah.core.c.character;
import lombok.*;
@Getter@Setter
public class Boss {
    private String name;
    private int level;
    private int health;
    private int attack;
    private int defense;

    public Boss(String name, int level, int health, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }
    public boolean isLevel7() {
        return this.level == 7;
    }

    public void attack(int damage) {
        this.health -= damage;
    }

}