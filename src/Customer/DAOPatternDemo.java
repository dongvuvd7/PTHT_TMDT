/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author iWinter VD7
 */
public class DAOPatternDemo {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAOImpl();
        
        //get all
        for(Customer i : customerDAO.getAllCustomer()) {
            System.out.println(i.toString());
        }
        
        //update 
        Customer c = customerDAO.getCustomer("NU01");
        c.setName("Nguyen Thu Ha");
        customerDAO.updateCustomer(c);
        
        //get a
        customerDAO.getCustomer("NU01");
        
        
    }
}
