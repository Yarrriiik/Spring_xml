package com.example.xmldi.contents;

import org.springframework.stereotype.Component;

@Component("bookContents")
public class BookContents implements Contents {
    private final String title;

    public BookContents() {
        this.title = "Приключения Тома Сойера";
    }

    @Override
    public String describe() {
        return "Книга: \"" + title + "\"";
    }
}
