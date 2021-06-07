/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Distribution.Distribution;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.RetailStore.RetailStore;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
import userinterface.Store.StoreAdminJPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class StoreAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        RetailStore retailStore = null;
        int fl2=0;
        
        for(RetailStore ret:enterprise.getRetailStoreDirectory().getStores()){
            
            for(UserAccount ua:ret.getUserAccountDirectory().getUserAccountList()){
                if(ua.getUsername().equals(account.getUsername())){
                    retailStore = ret;
                    fl2=1;
                    break;
                }
            }
            if(fl2==1){
                break;
            }
        }
        ArrayList<Enterprise> dlist = new ArrayList();
        Network net = null;
        int fl=0;
        for(Network network:business.getNetworkList()){
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                if(ent.getName() == enterprise.getName()){
                    fl=1;
                    net = network;
                    break;
                }
                if(fl==1){
                    break;
                }
            }
        }
        for(Enterprise ent:net.getEnterpriseDirectory().getEnterpriseList()){
            if(ent.getEnterpriseType().getValue().equals("Distribution Unit")){
                dlist.add(ent);
            }
        }
        return new StoreAdminJPanel(userProcessContainer, account,dlist, retailStore);
    }
    
    @Override
    public String toString(){
        return "Store Admin";
    }
}
