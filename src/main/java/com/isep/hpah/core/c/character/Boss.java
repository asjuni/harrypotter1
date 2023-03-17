package com.isep.hpah.core.c.character;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean isLevel7() {
        return this.level == 7;
    }

    public void attack(int damage) {
        this.health -= damage;
    }

}