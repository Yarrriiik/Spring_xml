package com.example.xmldi.contents;

import org.springframework.stereotype.Component;

@Component("toyContents")
public class ToyContents implements Contents {
    private final String name;

    public ToyContents() {
        this.name = "Радиоуправляемая машина";
    }

    @Override
    public String describe() {
        return "Игрушка: " + name;
    }
}
