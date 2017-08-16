package com.example.zhudong.a130materialtest;

/**
 * Created by zhudong on 2017/8/8.
 */

public class Fruit {
    private String name;

    private int imageId;

    public Fruit(String apple, int imageId) {
        this.name = apple;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
