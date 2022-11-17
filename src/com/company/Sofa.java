package com.company;

public class Sofa extends Furniture{
    private boolean sleepingMode;


    public Sofa(int height, int width, int length, double weight) {
        super(height, width, length, weight);
        sleepingMode = false;
    }

    public void changeMode(){
        sleepingMode = !sleepingMode;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        if (sleepingMode){
            return width * 2;
        }
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
        return "Sofa\t" + getHeight() + "x" + getWidth() +
                "x" + getLength() + "mm\t" + getWeight() + "kg";
    }
}
