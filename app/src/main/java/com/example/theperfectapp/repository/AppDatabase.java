package com.example.theperfectapp.repository;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.theperfectapp.data.model.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao getUserDao();
}
