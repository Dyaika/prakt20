package com.company;

public class FurnitureShop {
    private static int sold = 0;
    private String name;
    public Sofa buySofa(){
        sold++;
        return new Sofa(
                (int)(Math.random() * 500 + 1000),
                (int)(Math.random() * 500 + 1100),
                (int)(Math.random() * 500 + 1600),
                Math.random() * 50 + 30);
    }
    public GamingChair buyGamingChair(){
        sold++;
        return new GamingChair(
                (int)(Math.random() * 500 + 1000),
                (int)(Math.random() * 500 + 100),
                (int)(Math.random() * 500 + 100),
                Math.random() * 10 + 7);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Table buyTable(){
        sold++;
        return new Table(
                (int)(Math.random() * 500 + 1000),
                (int)(Math.random() * 500 + 1300),
                (int)(Math.random() * 500 + 1300),
                Math.random() * 10 + 10);
    }

    public FurnitureShop(String name) {
        this.name = name;
    }

    static int getSold(){
        return sold;
    }
}
