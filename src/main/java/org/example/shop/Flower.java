package org.example.shop;

import java.util.List;

public class Flower {
    private String name;
    private int price;
    private List<String> colours;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColours(List<String> colours) {
        this.colours = colours;
    }

    public List<String> getColours() {
        return colours;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
