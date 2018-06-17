package ru.bookstore.domain;

import javax.persistence.*;

@Entity
@Table(name = "books_authors")
public class BooksAuthorsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "book", nullable = false)
    private int book;

    @Column(name = "author", nullable = false)
    private int author;

    public BooksAuthorsEntity(int book, int author) {
        this.book = book;
        this.author = author;
    }

    public BooksAuthorsEntity() {
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

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }
}
