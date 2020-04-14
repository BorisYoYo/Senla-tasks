package com.senlainc.task_6;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag(5);

        bag.putToBag(new Thing("Apple",6,2));
        bag.putToBag(new Thing("Rope",4,3));
        bag.putToBag(new Thing("Axe",7,5));
        bag.putToBag(new Thing("Boots",8,4));
        bag.putToBag(new Thing("Big useless stick",1,10));
        bag.putToBag(new Thing("Magic stick", 10,1));
        bag.putToBag(new Thing("Hat", 5,2));
        bag.putToBag(new Thing("Nail", 3,1));
        bag.putToBag(new Thing("Matches", 6,1));
        bag.putToBag(new Thing("Constitution of the RF", -666,1));
        bag.putToBag(new Thing("Worm",3,1));

        System.out.println(bag.toString());
    }
}
