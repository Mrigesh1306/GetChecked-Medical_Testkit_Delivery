/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Products;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class ProductDirectory {
    private ArrayList<Product> products;
    
    public ProductDirectory(){
        products = new ArrayList();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
    public Product newProduct(String productname, double price, int quantity){
        Product prod = new Product(productname, price, quantity);
        products.add(prod);
        return prod;
    }
    
    public void removeProduct(Product prod){
        products.remove(prod);
    }
}
