/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.util.List;

/**
 *
 * @author iWinter VD7
 */
public interface OrderDAO {
    public List<Order> getAllOrder();
    public Order getOrder(String id);
    public void updateOrder(Order order);
    public void deleteOrder(Order order);
    public void addOrder(Order order);
}
