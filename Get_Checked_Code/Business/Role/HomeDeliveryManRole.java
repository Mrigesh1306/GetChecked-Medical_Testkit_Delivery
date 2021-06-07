/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Distribution.Distribution;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HomeDeliveryMan.HomeDeliveryManJPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class HomeDeliveryManRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Distribution distribution =  null;
        int fl=0;
        for(Distribution mw:enterprise.getDistributionDirectory().getDistributions()){
            
            for(UserAccount ua:mw.getUserAccountDirectory().getUserAccountList()){
                if(ua.getUsername().equals(account.getUsername())){
                    distribution = mw;
                    fl=1;
                    break;
                }
            }
            if(fl==1){
                break;
            }
        }
        
        return new HomeDeliveryManJPanel(userProcessContainer, account, distribution);
    }
    
    @Override
    public String toString(){
        return "Home Delivery Man";
    }
    
    
}
