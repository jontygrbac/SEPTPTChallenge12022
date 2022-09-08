package com.sept.sept_challenge.dao;

import com.sept.sept_challenge.model.Item;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemDao {

    //Simulate the data in the database
    private static Map<Integer, Item> item = null;

    static {
        item = new HashMap<>();
        item.put(1, new Item("15321", "Boots", "Desc", 50.02));
        item.put(2, new Item("123", "Shirt", "Desc", 12.02));
        item.put(3, new Item("4324312", "Pants", "Desc", 15.99));
        item.put(4, new Item("123213", "Shorts", "Desc", 183.2));

    }

    //get all the items
    public Collection<Item> getItem(){
        return item.values();
    }

    //get the item by ID
    public Item getItem(String id){
        return  item.get(id);
    }


}