/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Distribution.Distribution;
import Business.Order.Order;
import Business.RetailStore.RetailStore;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class StoreAdminOrderWorkRequest extends WorkRequest{
    private Order order;
    private String message;
    private Distribution distribution;
    private RetailStore retailStore;

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

    public RetailStore getRetailStore() {
        return retailStore;
    }

    public void setRetailStore(RetailStore retailStore) {
        this.retailStore = retailStore;
    }
    
    @Override
    public String toString(){
        return this.message;
    }
}
