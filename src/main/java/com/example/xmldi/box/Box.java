package com.example.xmldi.box;

import com.example.xmldi.contents.Contents;

public class Box {
    private final int width;
    private final int height;
    private final int length;
    private final Contents contents; // зависимость по ссылке

    public Box(int width, int height, int length, Contents contents) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.contents = contents;
    }

    public String info() {
        return "Коробка " + width + "x" + height + "x" + length + " содержит: " + contents.describe();
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", contents=" + contents +
                '}';
    }
}
