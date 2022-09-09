package com.sept.sept_challenge.dao;


import com.sept.sept_challenge.model.Item;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemDao {

    //Simulate the data in the database
    private static Map<Integer, Item> itemmap = null;
    static Integer count = 1;

    static {
        itemmap = new HashMap<>();

        itemmap.put(count, new Item("15321", "Boots", "Desc", 50.02));
        ++count;
        itemmap.put(count, new Item("123", "Shirt", "Desc", 12.02));
        ++count;
        itemmap.put(count, new Item("4324312", "Pants", "Desc", 15.99));
        ++count;
        itemmap.put(count, new Item("123213", "Shorts", "Desc", 183.2));

    }

    //get all the items
    public static Collection<Item> getAllItem() {
        return itemmap.values();
    }

    public static Item save(Item item)
    {
        ++count;
        itemmap.put(count, item);
        return item;
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