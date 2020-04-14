package com.senlainc.task_6;

import java.util.ArrayList;
import java.util.Comparator;

public class Bag {

    private int cap;
    private int capacity;
    private ArrayList<Thing> things = new ArrayList<>();

    Bag(int capacity) {
        this.capacity = capacity;
        cap = capacity;
    }

    public void putToBag(Thing thing) {
        if (capacity - thing.getWeight() > -1) {
            things.add(thing);
            capacity -= thing.getWeight();
        } else if (things.size() != 0) {
            things.sort(Comparator.comparing(things -> things.getUtility()));
            for (Thing th: things) {
                if (th.getWeight() - thing.getWeight() >= 0) {
                    replaceThing(thing);
                }
            }
        }
    }

    public void replaceThing(Thing thing) {
        capacity += things.get(0).getWeight() - thing.getWeight();
        things.set(0,thing);
    }

    @Override
    public String toString() {
        int value = 0, weight = 0, utility = 0;
        StringBuilder sb = new StringBuilder("Things in bag: \n");
        for (Thing th: things) {
            value += th.getPrice(); weight += th.getWeight(); utility += th.getUtility();
            sb.append("Name: " + th.getName() + " — Price: " + th.getPrice() + " — Weight: " + th.getWeight() + '\n');
        }
        sb.append("\nStatus: \n");
        sb.append("Total value: " + value + '\n');
        sb.append("Total weight: " + weight + '\n');
        sb.append("Total utility: " + utility + '\n');
        sb.append("Free space in bag: " + capacity + "/" + cap);
        return new String(sb);
    }
}
