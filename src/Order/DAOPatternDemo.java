/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author iWinter VD7
 */
public class DAOPatternDemo {
    public static void main(String[] args) {
        OrderDAO orderDAO = new OrderDAOImpl();
        
        //get all
        for(Order i : orderDAO.getAllOrder()) {
            System.out.println(i.toString());
        }
        
        //update
        Order b = orderDAO.getOrder("TS02");
        b.setName("Tra sua chan trau size L");
        b.setPrice("80k");
        System.out.println(b.toString());
        orderDAO.updateOrder(b);
        
        //get a
        orderDAO.getOrder("TS02").toString();
        
        
    }
}
