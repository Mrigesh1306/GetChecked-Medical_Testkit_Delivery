/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitals;
    
    public HospitalDirectory(){
        this.hospitals = new ArrayList();
    }
    
    public Hospital createHospital(String name){
        
        for (Hospital hospital:hospitals){
            if(hospital.getHospitalName().equals(name)){
                return null;
            }
        }
        
        Hospital hospital = new Hospital(name);
        this.hospitals.add(hospital);
        return hospital;
    }
    
    public void deleteHospital(String name){
        for (Hospital hospital:hospitals){
            if(hospital.getHospitalName().equals(name)){
                hospitals.remove(hospital);
                break;
            }
        }
    }

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }
    
}
