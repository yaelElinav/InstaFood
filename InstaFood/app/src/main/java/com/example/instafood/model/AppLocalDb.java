package com.example.instafood.model;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.instafood.MyApplication;

@Database(entities = {Dish.class}, version = 1)
abstract class AppLocalDbRepository extends RoomDatabase {
    public abstract DishDao studentDao();
}

public class AppLocalDb{
    static public AppLocalDbRepository db =
            Room.databaseBuilder(MyApplication.context,
                    AppLocalDbRepository.class,
                    "dbFileName.db")
                    .fallbackToDestructiveMigration()
                    .build();

}
