package ru.bookstore.domain;


import javax.persistence.*;
import java.util.Base64;

@Entity
@Table(name = "Books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "cover", nullable = false)
    private int cover;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "pages", nullable = false)
    private int pages;

    @Column(name = "publishhouse", nullable = false)
    private int publishhouse;

    @Column(name = "language", nullable = false)
    private int language;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name="description")
    private String text;

    public BookEntity(String name, double price, int cover, int year, int pages, int publishhouse, int language, int quantity, String image, String text) {
        this.name = name;
        this.price = price;
        this.cover = cover;
        this.year = year;
        this.pages = pages;
        this.publishhouse = publishhouse;
        this.language = language;
        this.quantity = quantity;
        this.image = image;
        this.text = text;
    }

    public BookEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublishhouse() {
        return publishhouse;
    }

    public void setPublishhouse(int publishhouse) {
        this.publishhouse = publishhouse;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int langeage) {
        this.language = langeage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
