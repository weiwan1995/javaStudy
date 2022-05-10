package com.zhou.homework01.User;

import com.zhou.homework01.Door.Door;

public class Guest {
    private String name;

    public Guest() {
    }

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                '}';
    }

    public void pressBell(Door.Bell bell) {
        System.out.println(name+"按下门铃");
        bell.setBellOn();
    }
}
