package ru.bookstore.form;

public class BooksAuthors {
    private int book;
    private int author;

    public BooksAuthors(int book, int author) {
        this.book = book;
        this.author = author;
    }

    public BooksAuthors() {
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }
}
