/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FDAAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class FDAClinicalOrganization extends Organization{
    
    private String organizationType;
    
    public FDAClinicalOrganization(String organizationType){
        super(Organization.Type.FDAClinicalApproval.getValue());
        this.organizationType = organizationType;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FDAAdminRole());
        return roles;
    }
}
