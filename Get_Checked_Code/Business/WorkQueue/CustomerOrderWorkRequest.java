/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Distribution.Distribution;
import Business.Order.Order;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class CustomerOrderWorkRequest extends WorkRequest{
    
    private Order order;
    private String message;
    private Distribution distribution;
    private Customer customer;

    public Order getOrder() {
        return order;
    }

    public void setOrders(Order orders) {
        this.order = orders;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Distribution getDistribution() {
        return distribution;
    }

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @Override
    public String toString(){
        return this.message;
    }
    
}
