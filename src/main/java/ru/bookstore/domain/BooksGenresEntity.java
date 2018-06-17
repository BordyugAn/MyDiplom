package ru.bookstore.domain;

import javax.persistence.*;

@Entity
@Table(name = "books_genres")
public class BooksGenresEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "book", nullable = false)
    private int book;

    @Column(name = "genre", nullable = false)
    private int genre;

    public BooksGenresEntity(int book, int genre) {
        this.book = book;
        this.genre = genre;
    }

    public BooksGenresEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
