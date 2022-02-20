/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import Customer.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iWinter VD7
 */
public class CustomerDAOImpl implements CustomerDAO{

    //List thay the tam thoi cho database
    List<Customer> customers;

    public CustomerDAOImpl() {
        customers = new ArrayList<Customer>();
        Customer cus1 = new Customer("Nguyen Trung Thua", "NA01");
        Customer cus2 = new Customer("Phan Thi Thu Thao", "NU01");
        customers.add(cus1);
        customers.add(cus2);
    }
    
    @Override
    public List<Customer> getAllCustomer() {
        return customers;
    }

    @Override
    public Customer getCustomer(String id) {
        for(Customer i : customers) {
            if(i.getId().equals(id)) {
                System.out.println(i.toString());
                return i;
            }
        }
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {
        for(Customer i:customers) {
            if(i.getId().equals(customer.getId())){
                i.setName(customer.getName());
            }
        }
        System.out.println("Customer with id = " + customer.getId() + " updated in database"); 
    }

    @Override
    public void deleteCustomer(Customer customer) {
        for(Customer i:customers) {
            if(i.getId().equals(customer.getId())){
                customers.remove(i);
            }
        }
        System.out.println("Customer with id = " + customer.getId() + " removed in database");
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
}
