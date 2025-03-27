package com.bridgelabz.warehouse;
import java.util.*;
class WarehouseManager {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}