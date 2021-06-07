/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distribution;

import Business.Order.Order;
import Business.Organization.Organization;
import Business.Products.ProductDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class Distribution extends Organization{
    
    private String distributionName;
    private ProductDirectory productDirectory;
    private ArrayList<Order> orders;
    
    public Distribution(String name){
        super();
        this.distributionName=name;
        this.productDirectory = new ProductDirectory();
        this.orders = new ArrayList();
    }

    public String getDistributionName() {
        return distributionName;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }
    
    
    public void addOrder(Order order){
        this.orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
    
    
    @Override
    public String toString(){
        return this.distributionName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
