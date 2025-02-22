package com.example.model;

public class Animal {
    private int id;         // Поле id
    private String name;    // Имя животного
    private String species; // Вид животного

    public Animal() {}

    public Animal(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    // Геттер и сеттер для id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Геттеры и сеттеры для других полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}