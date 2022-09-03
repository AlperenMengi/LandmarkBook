package com.alperenmengi.landmarkbookjavamyself;

import java.io.Serializable;

public class Landmark implements Serializable {

    String name;
    String counrty;
    int image;

    public Landmark(String name, String counrty, int image) {
        this.name = name;
        this.counrty = counrty;
        this.image = image;
    }
}
