package com.isep.hpah.core.c;
import lombok.*;
@Getter@Setter
public class SortingHat extends House {
    public SortingHat() {
        System.out.println("\n=====================\n a class you will be assigned from n " +
                "among the 4 four by the magic hats \n=====================\n" +
                "Gryffindor \n" +
                "Poufsouffle \n" +
                "Serpentard \n" +
                "Serdaigle \n=====================\n");
        maison();
    }
}


