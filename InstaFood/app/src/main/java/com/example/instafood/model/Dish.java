package com.example.instafood.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dish {
    String id;
    @PrimaryKey
    @NonNull
    String name;
    String imgUrl;
    String makerID;
    Dish based;
    int likes;

    // TODO decide how to create the connection between the dish and it's derivatives (optional)

    public Dish(String id, String name, String imgUrl, String maker, Dish based) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
        this.makerID = maker;
        this.based = based;
        this.likes = 0;
    }


}
