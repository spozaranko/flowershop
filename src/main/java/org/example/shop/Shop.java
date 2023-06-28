package org.example.shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String adress;
    private String worktime;

    private List<Flower> flowers = new ArrayList<Flower>();

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }
}
