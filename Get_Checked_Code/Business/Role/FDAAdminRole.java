/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FDA.FDA;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
import userinterface.FDA.FDAAdminWorkAreaJPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class FDAAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        
        
        FDA f = null;
        int fl2=0;
        
        for(FDA fda:enterprise.getFdas().getFDA()){
            
            for(UserAccount ua:fda.getUserAccountDirectory().getUserAccountList()){
                if(ua.getUsername().equals(account.getUsername())){
                     f= fda;
                    fl2=1;
                    break;
                }
            }
            if(fl2==1){
                break;
            }
        }
        
        
        ArrayList<Enterprise> warehouseEnterprises = new ArrayList();
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
            if(ent.getEnterpriseType().getValue().equals("Manifacturing Unit")){
                warehouseEnterprises.add(ent);
            }
        }
        return new FDAAdminWorkAreaJPanel(userProcessContainer, account, warehouseEnterprises, f);
    }
    
    @Override
    public String toString(){
        return "FDA Admin";
    }
    
}
