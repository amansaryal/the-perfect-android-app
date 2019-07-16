package com.example.theperfectapp.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.theperfectapp.data.model.User;
import com.example.theperfectapp.service.LoginService;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class LoginRepository {

    private static volatile LoginRepository instance;
    private MutableLiveData<User> mutableUser;
    private AppDatabase database;
    private LoginService loginService;


    // private constructor : singleton access
    private LoginRepository(AppDatabase database, LoginService loginService) {
        this.database = database;
        this.loginService = loginService;
        this.mutableUser = new MutableLiveData<>();
    }

    public static LoginRepository getInstance(AppDatabase database, LoginService loginService) {
        if (instance == null) {
            instance = new LoginRepository(database, loginService);
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return false;
    }

    public void logout() {
        //TODO
    }

    private void setLoggedInUser(User user) {

    }

    public LiveData<User> login(String username, String password) {
        // handle login
        return null;
    }
}
