package com.example.bt3.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.bt3.model.User;

import java.util.List;
@Dao
public interface UserDAO {
    @Insert
    void InsertUser(User user);

    @Query("SELECT * FROM UserSV")
    List<User> getListUser();

    @Update
    void UpdateUser(User user);

    @Delete
    void DeleUser(User user);
}
