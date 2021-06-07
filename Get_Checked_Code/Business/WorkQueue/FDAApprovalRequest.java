/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FDA.FDA;
import Business.ManifacturingWarehouse.ManufacturingWarehouse;
import Business.Products.Product;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class FDAApprovalRequest extends WorkRequest{
    private String message;
    private String status;
    private Product product;
    private FDA fda;
    private ManufacturingWarehouse mw;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public FDA getFda() {
        return fda;
    }

    public void setFda(FDA fda) {
        this.fda = fda;
    }

    public ManufacturingWarehouse getMw() {
        return mw;
    }

    public void setMw(ManufacturingWarehouse mw) {
        this.mw = mw;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String toString(){
        return this.message;
    }
}
