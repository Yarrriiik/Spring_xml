package com.example.xmldi.contents;

public class ToyContents implements Contents {
    private final String type;

    public ToyContents(String type) {
        this.type = type;
    }

    @Override
    public String describe() {
        return "Игрушка: " + type;
    }

    @Override
    public String toString() {
        return "ToyContents{type='" + type + "'}";
    }
}
