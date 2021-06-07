/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Distribution.Distribution;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ManifacturingWarehouse.ManufacturingWarehouse;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Shipping.ShippingManJPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ShippingManRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        ManufacturingWarehouse manufacturingWarehouse =  null;
        int fl=0;
        for(ManufacturingWarehouse mw:enterprise.getManufacturingWarehouseDirectory().getWarehousedirectory()){
            
            for(UserAccount ua:mw.getUserAccountDirectory().getUserAccountList()){
                if(ua.getUsername().equals(account.getUsername())){
                    manufacturingWarehouse = mw;
                    fl=1;
                    break;
                }
            }
            if(fl==1){
                break;
            }
        }
        return new ShippingManJPanel(userProcessContainer, account, manufacturingWarehouse);
    }
    
    @Override
    public String toString(){
        return "Shipping Man";
    }
}
