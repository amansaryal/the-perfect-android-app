package com.example.theperfectapp;

import android.app.Application;

import androidx.room.Room;

import com.example.theperfectapp.repository.AppDatabase;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApplication extends Application {

    private AppDatabase db;

    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "the-perfect-app-db").build(); // add to DI

        retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
    }

    public AppDatabase getDb() {
        return db;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
