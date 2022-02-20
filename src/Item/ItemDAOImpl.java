/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import Item.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iWinter VD7
 */
public class ItemDAOImpl implements ItemDAO{

    //List thay the tam thoi cho database
    List<Item> items;

    public ItemDAOImpl() {
        items = new ArrayList<Item>();
        Item item1 = new Item("But bi Thien Long", "B01");
        Item item2 = new Item("Thuoc ke eke", "TK01");
        items.add(item1);
        items.add(item2);
    }
    
    @Override
    public List<Item> getAllItem() {
        return items;
    }

    @Override
    public Item getItem(String id) {
        for(Item i : items) {
            if(i.getId().equals(id)) {
                System.out.println(i.toString());
                return i;
            }
        }
        return null;
    }

    @Override
    public void updateItem(Item item) {
        for(Item i:items) {
            if(i.getId().equals(item.getId())){
                i.setName(item.getName());
            }
        }
        System.out.println("Item with id = " + item.getId() + " updated in database"); 
    }

    @Override
    public void deleteItem(Item item) {
        for(Item i:items) {
            if(i.getId().equals(item.getId())){
                items.remove(i);
            }
        }
        System.out.println("Item with id = " + item.getId() + " removed in database");
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }
    
}
