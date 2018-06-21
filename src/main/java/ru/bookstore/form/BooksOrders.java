package ru.bookstore.form;

public class BooksOrders {
    private int order;
    private int book;
    private int quantity;

    public BooksOrders(int order, int book, int quantity) {
        this.order = order;
        this.book = book;
        this.quantity = quantity;
    }

    public BooksOrders() {
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
