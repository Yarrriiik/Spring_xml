// com/example/xmldi/Main.java
package com.example.xmldi;

import com.example.xmldi.box.Box;
import com.example.xmldi.config.AppConfig;
import com.example.xmldi.support.LabelHolder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Box book = ctx.getBean("bookBox", Box.class);
            Box toy  = ctx.getBean("toyBox", Box.class);
            LabelHolder label = ctx.getBean(LabelHolder.class);

            System.out.println(book.info());
            System.out.println(toy.info());
            System.out.println(label.print());
        }
    }
}
