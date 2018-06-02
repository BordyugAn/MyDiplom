package ru.bookstore.domain;

import javax.persistence.*;

@Entity
@Table(name = "publish_houses")
public class PublishHouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "country", nullable = true)
    private String country;

    @Column(name = "city", nullable = true)
    private String city;

    public PublishHouseEntity() {
    }

    public PublishHouseEntity(String name, String country, String city) {
        this.name = name;
        this.country = country;
        this.city = city;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
