/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ApproveDoctor.ApproveDoctorJPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ApproveDoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Hospital hospital = null;
        int fl2=0;
        
        for(Hospital hos:enterprise.getHospitalDirectory().getHospitals()){
            
            for(UserAccount ua:hos.getUserAccountDirectory().getUserAccountList()){
                if(ua.getUsername().equals(account.getUsername())){
                    hospital = hos;
                    fl2=1;
                    break;
                }
            }
            if(fl2==1){
                break;
            }
        }
        return new ApproveDoctorJPanel(userProcessContainer, account,hospital);
    }
    
    @Override
    public String toString(){
        return "Approve Doctor";
    }
}
