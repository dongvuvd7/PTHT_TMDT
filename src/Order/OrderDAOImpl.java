/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author iWinter VD7
 */
public class OrderDAOImpl implements OrderDAO{
    
    //List thay the tam thoi cho database
    List<Order> orders;

    public OrderDAOImpl() {
        orders = new ArrayList<Order>();
        Order order1 = new Order("Tra sua size L", "TS02", "100k");
        Order order2 = new Order("Bun cha", "B01", "50k");
        orders.add(order1);
        orders.add(order2);
    }
    
    

    @Override
    public List<Order> getAllOrder() {
        return orders;
    }

    @Override
    public Order getOrder(String id) {
        for(Order i : orders) {
            if(i.getId().equals(id)) {
                System.out.println(i.toString());
                return i;
            }
        }
        return null;
    }

    @Override
    public void updateOrder(Order order) {
        for(Order i:orders) {
            if(i.getId().equals(order.getId())){
                i.setName(order.getName());
                i.setPrice(order.getPrice());
            }
        }
        System.out.println("Order with id = " + order.getId() + " updated in database"); 
        
    }

    @Override
    public void deleteOrder(Order order) {
        for(Order i:orders) {
            if(i.getId().equals(order.getId())){
                orders.remove(i);
            }
        }
        System.out.println("Order with id = " + order.getId() + " removed in database"); 
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }
    
}
