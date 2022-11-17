package com.company;

public class Table extends Furniture{
    public Table(int height, int width, int length, double weight) {
        super(height, width, length, weight);
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Table\t" + getHeight() + "x" + getWidth()+ "x" + getLength() + "mm\t" +getWeight() + "kg";
    }
}
