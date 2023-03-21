package com.isep.hpah.core.c;
import lombok.*;
import static com.isep.hpah.core.c.House.maison;
@Getter@Setter
public class SortingHat extends House{
    static {
        System.out.println(" a class you will be assigned from n " +
                "among the 4 four by the magic hats n n" +
                "Gryffindor n" +
                "Poufsouffle n" +
                "Serpentard n" +
                "Serdaigle n");
        maison();

    }
}

