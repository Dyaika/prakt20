package com.company;

public class GamingChair extends Furniture{
    private boolean up;
    public GamingChair(int height, int width, int length, double weight) {
        super(height, width, length, weight);
        up = false;
    }

    public void up(){
        up = true;
    }

    public void down(){
        up = false;
    }

    @Override
    public int getHeight() {
        if (up){
            return height * 2;
        }
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
        return "G.Chair\t" + getHeight() + "x" + getWidth() +
                "x" + getLength() + "mm\t" + getWeight() + "kg";
    }
}
