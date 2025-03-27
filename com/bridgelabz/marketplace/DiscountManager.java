package com.bridgelabz.marketplace;

class DiscountManager {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied: " + percentage + "% off on " + product.getName());
    }
}
