/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import Item.Item;
import java.util.List;

/**
 *
 * @author iWinter VD7
 */
public interface ItemDAO {
    public List<Item> getAllItem();
    public Item getItem(String id);
    public void updateItem(Item item);
    public void deleteItem(Item item);
    public void addItem(Item item);
}
