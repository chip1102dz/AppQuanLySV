package com.example.bt3.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "UserSV")
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String phone;
    private String birth;
    private String position;
    private String tinhnguyen;

    public User(int id, String name, String phone, String birth, String position, String tinhnguyen) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birth = birth;
        this.position = position;
        this.tinhnguyen = tinhnguyen;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTinhnguyen() {
        return tinhnguyen;
    }

    public void setTinhnguyen(String tinhnguyen) {
        this.tinhnguyen = tinhnguyen;
    }
}
