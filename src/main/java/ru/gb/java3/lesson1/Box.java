package ru.gb.java3.lesson1;

import java.util.ArrayList;
import java.util.Comparator;

public class Box<B extends Fruit> {
    private ArrayList<B> box = new ArrayList<>();

    public void addFruit(B fruit) {

        box.add(fruit);
    }

    public boolean compare(Box box) {
        if (weight() == weight(box)) {
            return true;
        } else {
            return false;
        }

    }

    private float weight(Box b) {
        int size = b.box.size();
        Fruit o = (Fruit) b.box.get(0);
        float w = o.weight * size;
        return w;

    }
    public float weight() {
        int size = this.box.size();
        Fruit o = (Fruit) this.box.get(0);
        float w = o.weight * size;
        return w;

    }


}

