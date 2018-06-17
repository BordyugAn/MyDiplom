package ru.bookstore.form;

public class BooksGenres {
    private int book;
    private int genre;

    public BooksGenres(int book, int genre) {
        this.book = book;
        this.genre = genre;
    }

    public BooksGenres() {
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }
}
