package com.example.instafood.model;

public class Cook {
    String id;
    String name;
    String imgUrl;


    public Cook(String id, String name, String imgUrl) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
    }


    // TODO decide how to create the connection between the cook and the dish (one to many relation)
    // TODO decide how to save dishes (for local storage)
}
