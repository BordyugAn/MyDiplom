package ru.bookstore.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "buyer", nullable = false)
    private int buyer;

    @Column(name = "status", nullable = false)
    private int status;

    @Column(name = "delivery", nullable = false)
    private int delivery;

    @Column(name = "sum", nullable = false)
    private double sum;

    @Column(name = "address", nullable = true)
    private Integer address;

    public OrderEntity(Date date, int buyer, int status, int delivery, double sum, Integer address) {
        this.date = date;
        this.buyer = buyer;
        this.status = status;
        this.delivery = delivery;
        this.sum = sum;
        this.address = address;
    }

    public OrderEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }
}
