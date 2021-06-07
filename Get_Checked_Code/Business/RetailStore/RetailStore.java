/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RetailStore;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class RetailStore extends Organization {
  
    private String storeName;
    
    public RetailStore(String storeName){
        super();
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String toString(){
        return this.storeName;
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
