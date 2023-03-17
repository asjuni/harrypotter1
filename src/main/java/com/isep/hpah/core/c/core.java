package com.isep.hpah.core.c;

import lombok.*;


@Getter
public enum core {

    PHOENIX_FEATHER("PHOENIX_FEATHER"),
    DRAGON_HEARTSTRING("DRAGON_HEARTSTRING"),
    UNICORN_HAIR("UNICORN_HAIR");

    private String name;

    core(String name) {
        this.name = name;
    }


}
