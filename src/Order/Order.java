/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @price iWinter VD7
 */
public class Order {
    private String name;
    private String id;
    private String price;

    public Order(String name, String id, String price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public Order() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" + "name=" + name + ", id=" + id + ", price=" + price + '}';
    }
    
    
    
}
