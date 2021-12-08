package com.ugur.SalesOrderSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {
    public static List<Item> itemList = new ArrayList<>();

    @GetMapping("item")
    public String getItemInputForm(Model model) {
        model.addAttribute("itemToSave", new Item());
        return "ItemInputForm";
    }

    @PostMapping("saveItem")
    public String saveNewItem(Model model, Item item) {
        model.addAttribute("itemToSave", new Item());
        model.addAttribute("itemList", itemList);
        itemList.add(item);
        return "AllItems";
    }

    @GetMapping("allItems")
    public String getAllItems(Model model) {
        model.addAttribute("itemList", itemList);
        return "AllItems";
    }

}
