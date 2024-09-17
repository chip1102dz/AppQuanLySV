package com.example.bt3.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.bt3.model.User;

@Database(entities = {User.class}, version = 1)
public abstract class UserDataBase extends RoomDatabase {
    private static final String NAME_DATABASE = "UserSV.db";
    private static UserDataBase instace;

    public static synchronized UserDataBase getInstance(Context context){
        if (instace == null){
            instace = Room.databaseBuilder(context.getApplicationContext(), UserDataBase.class, NAME_DATABASE)
                    .allowMainThreadQueries()
                    .build();
        }
        return instace;
    }
}
