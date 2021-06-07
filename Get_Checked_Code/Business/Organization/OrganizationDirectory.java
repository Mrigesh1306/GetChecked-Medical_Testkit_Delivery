/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String name, Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.DoctorApprove.getValue())){
            organization = new ApprovingDoctorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DoctorConsult.getValue())){
            organization = new ConsultingDoctorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FDAClinicalApproval.getValue())){
            organization = new FDAClinicalOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HomeDelivery.getValue())){
            organization = new HomeDeliveryOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LaboratoryAdmin.getValue())){
            organization = new LaboratoryAdminOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Manager.getValue())){
            organization = new ManagerOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ManifacturingAdmin.getValue())){
            organization = new ManifacturingAdminOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RetailDelivery.getValue())){
            organization = new RetailDeliveryOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ShippingMan.getValue())){
            organization = new ShippingOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.StoreAdmin.getValue())){
            organization = new StoreAdminOrganziation(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Technician.getValue())){
            organization = new TechnicianOrganization(name);
            organizationList.add(organization);
        }
        return organization;
    }
}