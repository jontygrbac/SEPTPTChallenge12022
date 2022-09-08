package com.sept.sept_challenge.dao;

import com.sept.sept_challenge.model.Item;
import org.springframework.stereotype.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemDao {

    //Simulate the data in the database
    private static Map<Integer, Item> itemmap = null;

    static {
        itemmap = new HashMap<>();
        itemmap.put(1, new Item("15321", "Boots", "Desc", 50.02));
        itemmap.put(2, new Item("123", "Shirt", "Desc", 12.02));
        itemmap.put(3, new Item("4324312", "Pants", "Desc", 15.99));
        itemmap.put(4, new Item("123213", "Shorts", "Desc", 183.2));

    }

    //get all the items
    public static Collection<Item> getAllItem() {
        return itemmap.values();
    }

    public static void save(Item item) {
        itemmap.put(4, item);
    }

    //get the item by ID
    public Item getItem(int id) {
        return itemmap.get(id);
    }

    public void update(int id) {
        Item item = itemmap.get(id);
        itemmap.remove(id);
        //Use/Choose method to update with
        itemmap.put(id, item);
    }

    public void delete(int id) {
        itemmap.remove(id);
    }
}