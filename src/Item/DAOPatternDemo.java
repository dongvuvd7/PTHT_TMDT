/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

/**
 *
 * @author iWinter VD7
 */
public class DAOPatternDemo {
    public static void main(String[] args) {
        ItemDAO itemDAO = new ItemDAOImpl();
        
        //get all
        for(Item i : itemDAO.getAllItem()) {
            System.out.println(i.toString());
        }
        
        //update 
        Item c = itemDAO.getItem("B01");
        c.setName("But chi B2");
        itemDAO.updateItem(c);
        
        //get a
        itemDAO.getItem("B01");
        
        
    }
}
