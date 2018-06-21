package ru.bookstore.domain;

import javax.persistence.*;

@Entity
@Table(name = "books_orders")
public class BooksOrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "orderid", nullable = false)
    private int order;

    @Column(name = "book", nullable = false)
    private int book;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    public BooksOrdersEntity(int order, int book, int quantity) {
        this.order = order;
        this.book = book;
        this.quantity = quantity;
    }

    public BooksOrdersEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
