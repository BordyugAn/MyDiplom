package ru.bookstore.form;

import java.sql.SQLData;

public class Order {
    private SQLData date;
    private int buyer, status, delivery, address;
    private double sum;

    public Order(SQLData date, int buyer, int status, int delivery, int address, double sum) {
        this.date = date;
        this.buyer = buyer;
        this.status = status;
        this.delivery = delivery;
        this.address = address;
        this.sum = sum;
    }

    public Order() {
    }

    public SQLData getDate() {
        return date;
    }

    public void setDate(SQLData date) {
        this.date = date;
    }

    public int getBuyer() {
        return buyer;
    }

    public void setBuyer(int buyer) {
        this.buyer = buyer;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
