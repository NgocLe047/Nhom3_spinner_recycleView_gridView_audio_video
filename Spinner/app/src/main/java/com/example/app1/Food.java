package com.example.app1;

public class Food {
    public int Hinh;
    public String Ten;
    public int IDHinh;

    public Food( int hinh, String ten, int IDHinh ) {

        Hinh = hinh;
        Ten = ten;
        this.IDHinh = IDHinh;
    }

    public int getHinh() {
        return Hinh;
    }

    public String getTen() {
        return Ten;
    }

    public int getIDHinh() {
        return IDHinh;
    }
}
