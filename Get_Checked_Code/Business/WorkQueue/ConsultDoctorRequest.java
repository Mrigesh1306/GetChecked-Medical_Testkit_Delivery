/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ConsultDoctorRequest extends WorkRequest{
    private ArrayList <String> symptoms;
    private Customer customer;
    private Hospital hospital;
    private String message;
    private String test;
    
    public ConsultDoctorRequest(){
        symptoms = new ArrayList();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    
    

    public ArrayList<String> getSymptoms() {
        return symptoms;
    }

    public void addSymptoms(String symptom) {
        this.symptoms.add(symptom);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String toString(){
        return message;
    }
    
}
