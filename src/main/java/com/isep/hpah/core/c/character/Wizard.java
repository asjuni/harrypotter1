package com.isep.hpah.core.c.character;

import com.isep.hpah.core.c.House;
import com.isep.hpah.core.c.Potion;
import com.isep.hpah.core.c.Wand;
import com.isep.hpah.core.c.spells.Pet;
import com.isep.hpah.core.c.spells.Spell;
import lombok.*;
import java.util.List;
@Getter@Setter
public class Wizard {

    private String name;
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;
    private int health;
    private boolean isDead;

    public Wizard(String name, Pet pet, Wand wand, List<Spell> knownSpells, List<Potion> potions) {
        this.name = name;
        this.pet = pet;
        this.wand = wand;
        this.knownSpells = knownSpells;
        this.potions = potions;
        this.health = 100;
        this.isDead = false;
    }

    public int attack() {
        return wand.castSpell().getDamage();
    }

    public void defense(int damage) {
        int remainingHealth = Math.max(0, health - damage);
        setHealth(remainingHealth);
        System.out.println(name + " has " + remainingHealth + " health remaining.");
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.isDead = true;
        }
    }

    public boolean isDead() {
        return isDead;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }

    public Wand getWand() {
        return wand;
    }

    public House getHouse() {
        return house;
    }

    public List<Spell> getKnownSpells() {
        return knownSpells;
    }

    public List<Potion> getPotions() {
        return potions;
    }
}