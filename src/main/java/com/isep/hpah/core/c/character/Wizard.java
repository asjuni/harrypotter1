package com.isep.hpah.core.c.character;

import com.isep.hpah.core.c.House;
import com.isep.hpah.core.c.Potion;
import com.isep.hpah.core.c.SortingHat;
import com.isep.hpah.core.c.Wand;
import com.isep.hpah.core.c.spells.Pet;
import com.isep.hpah.core.c.spells.Spell;

import java.util.List;

public class Wizad {

    private String name;
    private Pet pet ;

    private Wand wand ;

    private House house ;

    private List<Spell> knownSpells;

    private List<Potion> potion;
    /* constructor */

    public Wizad(String name , Pet pet, Wand wand, House house){
        this.name = name;
        this.pet = pet ;
        this.wand = wand ;
        this.house = house;
        this.knownSpells = knownSpells ;
        this.potion = potion ;
    }

    public void defend(){
    /*   implementer la methode ici  */
    }
}
