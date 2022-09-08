package com.sept.sept_challenge.controller;

import com.sept.sept_challenge.dao.ItemDao;
import com.sept.sept_challenge.model.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
@ResponseBody
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemDao itemDao;

    @GetMapping("/{id}")
    public @ResponseBody Item getTreeById(@PathVariable int id) {
        System.out.println(itemDao.getItem(id));
        return itemDao.getItem(id);
    }

    @GetMapping("/item")
    public @ResponseBody Collection<Item> getItemList() {
        return itemDao.getAllItem();
    }

    @PostMapping
    public Item createItem(Item item) {
        itemDao.save(item);
        return item;
    }

    @PutMapping("/item")
    public void update(int id){
        itemDao.update(id);
    }

    @DeleteMapping("/item")
    public void delete(int id){
        itemDao.delete(id);
    }



}