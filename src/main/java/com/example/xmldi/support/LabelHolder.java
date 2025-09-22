package com.example.xmldi.support;

public class LabelHolder {
    private String label;

    public void setLabel(String label) {
        this.label = label;
    }

    public String print() {
        return String.format("Наклейка: %s", label);
    }

}
