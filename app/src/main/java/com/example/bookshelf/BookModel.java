package com.example.bookshelf;

public class BookModel {
    int book_img;
    String book_name;

    public BookModel(int book_img, String book_name) {
        this.book_img = book_img;
        this.book_name = book_name;
    }

    public int getBook_img() {
        return book_img;
    }

    public void setBook_img(int book_img) {
        this.book_img = book_img;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
}

