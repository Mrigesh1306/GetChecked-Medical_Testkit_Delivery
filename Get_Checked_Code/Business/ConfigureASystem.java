package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        //Employee employee1 = system.getEmployeeDirectory().createEmployee("mee");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin1", "sysadmin1", employee, new SystemAdminRole());
        //UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("gautham", "gautham", employee, new SystemAdminRole());
        
        return system;
    }
    
}
