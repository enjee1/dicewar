package com.company;

public class Die {

    private int sides;
    private int value;

    public Die(int sides) {
        this.sides = sides;
        this.value = getValue();
    }

    public void roll() {
        value = (int) (Math.random() * sides + 1);
    }

    public int getValue() {
        return value;
    }

}
