package com.example.instafood.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DishDao{
    @Query("select * from Dish")
    List<Dish> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Dish...dishs );

    @Delete
    void delete(Dish dish);

}
