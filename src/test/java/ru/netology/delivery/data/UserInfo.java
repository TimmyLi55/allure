package ru.netology.delivery.data;

import lombok.Data;

@Data
public class UserInfo {
    String city;
    String name;
    String phone;

    public UserInfo(String city, String name, String phone) {
        this.city = city;
        this.name = name;
        this.phone = phone;
    }
}

