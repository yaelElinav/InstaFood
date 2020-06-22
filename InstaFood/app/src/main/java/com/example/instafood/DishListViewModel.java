package com.example.instafood;

import androidx.lifecycle.ViewModel;

import com.example.instafood.model.Dish;

import java.util.LinkedList;
import java.util.List;

public class DishListViewModel extends ViewModel {
    List<Dish> data = new LinkedList<Dish>();

    public List<Dish> getData() {
        return data;
    }
}
