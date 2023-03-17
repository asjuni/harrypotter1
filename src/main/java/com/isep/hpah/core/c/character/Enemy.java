package com.isep.hpah.core.c.character;
import lombok.*;
@Getter@Setter
public class Enemy {
    private String name;
    private int health;
    private int attackDamage;

    public Enemy(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public void attack(Wizard wizard) {
        int damage = this.getAttackDamage();
        wizard.takeDamage(damage);
        System.out.println(this.getName() + " attaque " + wizard.getName() + " et inflige " + damage + " dégâts.");
    }

    public void defense(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(this.getName() + " subit " + damage + " dégâts.");
    }

    public boolean isDead() {
        return health <= 0;
    }

}

