package project.model;

import java.util.Random;

public class Author {

    private Long id;

    private String name;

    private String surname;

    private Country country;

    public Author(){}

    public Author(String name, String surname, Country country){
        this.id = new Random().nextLong();
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
