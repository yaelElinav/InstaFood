package com.example.instafood.model;

public class Dish {
    String id;
    String name;
    String imgUrl;
    Cook maker;

    public Dish(String id, String name, String imgUrl, Cook maker) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
        this.maker = maker;
    }
}
