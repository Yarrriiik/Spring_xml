package com.example.xmldi;

import com.example.xmldi.box.Box;
import com.example.xmldi.support.LabelHolder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        try (ClassPathXmlApplicationContext ctx =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            Box bookBox = ctx.getBean("bookBox", Box.class);
            Box toyBox = ctx.getBean("toyBox", Box.class);
            LabelHolder labelHolder = ctx.getBean("labelHolder", LabelHolder.class);

            System.out.println(bookBox.info());
            System.out.println(toyBox.info());

            System.out.println(labelHolder.print());
        }
    }
}
