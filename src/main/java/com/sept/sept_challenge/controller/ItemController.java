package com.sept.sept_challenge.controller;

import com.sept.sept_challenge.dao.ItemDao;
import com.sept.sept_challenge.model.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
public class ItemController {

    private final ItemDao itemDao;

    ItemController(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @GetMapping("/item/{id}")
    Item getItem(@PathVariable int id) {
        return itemDao.getItem(id);
    }

    @GetMapping("/item")
    Collection<Item> all() {
        return ItemDao.getAllItem();
    }

    @PostMapping("/item")
    @ResponseBody
    public Item addItem(@RequestParam(name = "id") String id, @RequestParam String name, @RequestParam String desc
    , @RequestParam double price) {
    Item item = new Item(id, name, desc, price);
    itemDao.save(item);
    return item;
    }

    @PutMapping("/item")
    @ResponseBody
    public void update(@RequestParam int id){
        itemDao.update(id);
    }

    @DeleteMapping("/item")
    @ResponseBody
    void deleteEmployee(@RequestParam  int id) {
        itemDao.delete(id);
    }



}