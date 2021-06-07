/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HomeDeliveryManRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class HomeDeliveryOrganization extends Organization{
    
    private String organizationType;
    
    public HomeDeliveryOrganization(String organizationType){
        super(Organization.Type.HomeDelivery.getValue());
        this.organizationType = organizationType;
    }

    public String getOrganizationType() {
        return organizationType;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HomeDeliveryManRole());
        return roles;
    }
}
