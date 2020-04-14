package com.senlainc.task_6;

public class Thing {

    private int price;
    private int weight;
    private String name;

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getUtility() {
        return price - weight;
    }

    Thing(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}
