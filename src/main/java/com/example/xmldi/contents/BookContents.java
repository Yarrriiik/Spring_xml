package com.example.xmldi.contents;

public class BookContents implements Contents {
    private final String title;

    public BookContents(String title) {
        this.title = title;
    }

    @Override
    public String describe() {
        return "Книга: \"" + title + "\"";
    }

    @Override
    public String toString() {
        return "BookContents{title='" + title + "'}";
    }
}
