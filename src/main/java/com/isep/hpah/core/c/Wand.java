package com.isep.hpah.core.c;
import java.util.Scanner;

import com.isep.hpah.core.c.spells.Spell;
import lombok.*;
@Getter@Setter
public class Wand {
    private String core;
    private int length;

    public Wand(String core, int length) {
        this.core = core;
        this.length = length;
    }

    public Spell castSpell() {
        int damage = (int) (Math.random() * 10) + 1; // Simuler des dégâts aléatoires
        String name = "Spell";
        return new Spell(name, damage);
    }
}

