package com.isep.hpah.core.c.character;
import lombok.*;
@Getter@Setter
public abstract class AbstractEnemy {
    protected String name;
    protected int health;
    protected int damage;

    public AbstractEnemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

}
