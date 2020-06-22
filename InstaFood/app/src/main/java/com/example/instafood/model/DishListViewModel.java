package com.example.instafood.model;

import androidx.lifecycle.ViewModel;

import java.util.LinkedList;
import java.util.List;

public class DishListViewModel extends ViewModel {
    List<Dish> data = new LinkedList<Dish>();

    public List<Dish> getData() {
        return data;
    }
}
