package com.bridgelabz.warehouse;

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to respective storage
        electronicsStorage.addItem(new Electronics("Laptop", 1200.50));
        electronicsStorage.addItem(new Electronics("Smartphone", 800.00));

        groceriesStorage.addItem(new Groceries("Apple", 2.50));
        groceriesStorage.addItem(new Groceries("Milk", 1.20));

        furnitureStorage.addItem(new Furniture("Chair", 150.75));
        furnitureStorage.addItem(new Furniture("Table", 300.40));

        // Display items using wildcard method
        System.out.println("Electronics Storage:");
        WarehouseManager.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        WarehouseManager.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        WarehouseManager.displayItems(furnitureStorage.getItems());
    }
}