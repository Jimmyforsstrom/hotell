package com.company;

public class Sal {

    public String namn = "obokat";
    public int cost = 0;
    public int val;

    public Sal (String namn, int cost) {
        this.namn = namn;
        this.cost = cost;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
