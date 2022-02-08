package com.project.first.service;

import com.project.first.model.Item;

import java.util.ArrayList;
import java.util.List;

public class DBManager {

    private static List<Item> list = new ArrayList<>();

    static {
        list.add(new Item(1L, "Macbook Pro 2020", "8GB Ram, 256GB SSD, Intel Core i7", 1499.99));
        list.add(new Item(2L,"ASUS TUF GAMING","16GB RAM, 512GB SSD, AMD Ryzen 5",999.99));
        list.add(new Item(3L,"Apple Iphone 14 Pro","6GB RAM, 128GB Memory, Super Retina",1099.99));
    }

    public static List<Item> getItems(){
        return list;
    }
}
