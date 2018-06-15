package ru.bookstore.form;

public class Book {

    private String name;
    private double price;
    private int cover;
    private int year;
    private int pages;
    private int publishhouse;
    private int language;
    private int quantity;
    private byte[] image;
    private String text;

    public Book(String name, double price, int cover, int year, int pages, int publishhouse, int language, int quantity, byte[] image, String text) {
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

    public Book() {
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

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
