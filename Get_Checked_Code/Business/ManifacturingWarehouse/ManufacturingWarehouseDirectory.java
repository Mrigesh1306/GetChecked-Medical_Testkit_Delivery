/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ManifacturingWarehouse;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class ManufacturingWarehouseDirectory {
   private ArrayList<ManufacturingWarehouse> warehousedirectory;
   
   public ManufacturingWarehouseDirectory(){
       this.warehousedirectory = new ArrayList();
   }
    
    public ManufacturingWarehouse createWarehouse(String name){
        
        for (ManufacturingWarehouse warehouse:warehousedirectory){
            if(warehouse.getWareHouseName().equals(name)){
                return null;
            }
        }
        
        ManufacturingWarehouse warehouse = new ManufacturingWarehouse(name);
        this.warehousedirectory.add(warehouse);
        return warehouse;
    }
    
//    public void deleteWarehouse(String name){
//        for (ManufacturingWarehouse warehouse:warehousedirectory){
//            if(warehouse.getWareHouseName().equals(name)){
//                warehousedirectory.remove(warehouse);
//                break;
//            }
//        }
//    }

    public ArrayList<ManufacturingWarehouse> getWarehousedirectory() {
        return warehousedirectory;
    } 

    public void deleteWarehouse(ManufacturingWarehouse warehouse) {
        warehousedirectory.remove(warehouse);
    }
    
}
