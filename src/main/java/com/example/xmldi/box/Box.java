// com/example/xmldi/box/Box.java
package com.example.xmldi.box;
import com.example.xmldi.contents.Contents;

public class Box {
    private final int width, height, length;
    private final Contents contents;

    public Box(int width, int height, int length, Contents contents) {
        this.width = width; this.height = height; this.length = length; this.contents = contents;
    }

    public String info() {
        return "Коробка " + width + "x" + height + "x" + length + " содержит: " + contents.describe();
    }

    // init/destroy-методы (вызываются контейнером)
    public void init() { System.out.println("Box.init()"); }
    public void destroy() { System.out.println("Box.destroy()"); }
}
