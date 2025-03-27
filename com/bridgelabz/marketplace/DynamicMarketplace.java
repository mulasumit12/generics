package com.bridgelabz.marketplace;

import java.util.ArrayList;
import java.util.List;

public class DynamicMarketplace {
    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();

        // Adding different products to the catalog
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", 25.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 500.0, new GadgetCategory());

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        // Applying discounts
        DiscountManager.applyDiscount(book, 10);  // 10% discount on book
        DiscountManager.applyDiscount(shirt, 20); // 20% discount on clothing
        DiscountManager.applyDiscount(phone, 5);  // 5% discount on gadget

        // Displaying the catalog
        System.out.println("\nUpdated Product Catalog:");
        for (Product<?> product : catalog) {
            System.out.println(product);
        }
    }
}