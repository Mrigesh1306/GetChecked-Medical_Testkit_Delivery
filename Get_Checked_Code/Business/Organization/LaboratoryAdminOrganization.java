/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class LaboratoryAdminOrganization extends Organization{
    
    private String organizationType;
    
    public LaboratoryAdminOrganization(String organizationType){
        super(Organization.Type.LaboratoryAdmin.getValue());
        this.organizationType = organizationType;
        
    }
    public String getOrganizationType(){
        return organizationType; 
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAdminRole());
        return roles;
    }
    
}
