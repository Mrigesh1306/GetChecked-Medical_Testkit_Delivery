/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TechnicianRole;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class TechnicianOrganization extends Organization{
    private String organizationType;
    
    public TechnicianOrganization(String organizationType){
        super(Organization.Type.Technician.getValue());
        this.organizationType = organizationType;
        
    }

    public String getOrganizationType() {
        return organizationType;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TechnicianRole());
        return roles;
    }
}
