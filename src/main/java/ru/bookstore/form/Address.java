package ru.bookstore.form;

public class Address {
    private String city, street, build;
    private int room;

    public Address(String city, String street, String build, int room) {
        this.city = city;
        this.street = street;
        this.build = build;
        this.room = room;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
