/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class FDA extends Organization{
    private String name;
    
    public FDA(String name){
        super();
        this.name = name;
    }

    public String getFDAName() {
        return name;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    @Override
    public String toString(){
        return this.getFDAName();
    }
    
}
