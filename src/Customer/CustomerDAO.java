/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import Customer.Customer;
import java.util.List;

/**
 *
 * @author iWinter VD7
 */
public interface CustomerDAO {
    public List<Customer> getAllCustomer();
    public Customer getCustomer(String id);
    public void updateCustomer(Customer book);
    public void deleteCustomer(Customer book);
    public void addCustomer(Customer book);
}
