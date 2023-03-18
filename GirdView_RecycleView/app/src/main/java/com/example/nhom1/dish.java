package com.example.nhom1;

public class dish {

    private  String name;
    private int imageID;
    private String price;


    public void setName(String name) {
        this.name = name;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }
    public dish(String name,String price, int imageID) {
        this.name = name;
        this.price=price;
        this.imageID = imageID;

    }

    public dish() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
