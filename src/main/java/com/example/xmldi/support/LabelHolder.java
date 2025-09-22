package com.example.xmldi.support;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LabelHolder {
    private String label;

    @Value("${label.text}")
    public void setLabel(String label) { // setter-инъекция из properties
        this.label = label;
    }

    public String print() { return "Наклейка: " + label; }
}
