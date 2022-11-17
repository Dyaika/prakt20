package com.company;

public class Main {

    public static void main(String[] args) {
        FurnitureShop furnitureShop1 = new FurnitureShop("MAGAZ1");
        FurnitureShop furnitureShop2 = new FurnitureShop("MAGAZ2");

        Furniture furniture = furnitureShop1.buyGamingChair();
        System.out.println(furniture);
        furniture = furnitureShop2.buySofa();
        System.out.println(furniture);
        furniture = furnitureShop1.buyTable();
        System.out.println(furniture);
        System.out.println("Items sold: " + FurnitureShop.getSold());
    }
}
