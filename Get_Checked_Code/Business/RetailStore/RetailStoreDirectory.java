/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RetailStore;

import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class RetailStoreDirectory {
    private ArrayList<RetailStore> stores;
    
    public RetailStoreDirectory(){
        stores = new ArrayList();
    }
    
    public RetailStore createRetailStore(String name){
        
        for (RetailStore rstore:stores){
            if(rstore.getStoreName().equals(name)){
                return null;
            }
        }
        
        RetailStore rstore = new RetailStore(name);
        this.stores.add(rstore);
        return rstore;
    }
    
//    public void deleteRetailStore(String name){
//        for (RetailStore rstore:stores){
//            if(rstore.getStoreName().equals(name)){
//                stores.remove(rstore);
//                break;
//            }
//        }
//    }
    
    public void deleteRetailerStore(RetailStore rs){
        stores.remove(rs);
    }

    public ArrayList<RetailStore> getStores() {
        return stores;
    }
}
