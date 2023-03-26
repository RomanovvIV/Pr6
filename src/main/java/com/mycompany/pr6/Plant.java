package com.mycompany.pr6;

import java.io.Serializable;

public class Plant implements Serializable {
    private String name;
    private String specie;
    private int age;
    private int height;
    private int weight;

    public Plant(String name, String specie, int age, int height, int weight) {
        this.name = name;
        this.specie = specie;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecie() {
        return specie;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }  
}
