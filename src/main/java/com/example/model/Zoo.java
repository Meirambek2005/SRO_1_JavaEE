package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int id;         // Поле id
    private String name;    // Название зоопарка
    private List<Animal> animals = new ArrayList<>(); // Список животных
    private List<ZooKeeper> zooKeepers = new ArrayList<>(); // Список смотрителей

    // Конструктор по умолчанию
    public Zoo() {}

    // Конструктор с параметрами
    public Zoo(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<ZooKeeper> getZooKeepers() {
        return zooKeepers;
    }

    public void setZooKeepers(List<ZooKeeper> zooKeepers) {
        this.zooKeepers = zooKeepers;
    }

    // Методы для добавления животных и смотрителей
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addZooKeeper(ZooKeeper zooKeeper) {
        zooKeepers.add(zooKeeper);
    }
}