package com.company;

public abstract class Furniture {
    protected int height, width, length;
    protected double weight;

    public Furniture(int height, int width, int length, double weight) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public abstract int getHeight();

    public abstract int getWidth();

    public abstract int getLength();

    public abstract double getWeight();
}
