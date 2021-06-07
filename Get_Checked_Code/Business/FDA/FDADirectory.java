/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class FDADirectory {
    private ArrayList<FDA> fdas;
    
    public FDADirectory(){
        this.fdas = new ArrayList();
    }
    
    public FDA createFDA(String name){
        
        for (FDA fda:fdas){
            if(fda.getFDAName().equals(name)){
                return null;
            }
        }
        
        FDA fda = new FDA(name);
        this.fdas.add(fda);
        return fda;
    }
    
    public void deleteFDA(String name){
        for (FDA fda:fdas){
            if(fda.getFDAName().equals(name)){
                fdas.remove(fda);
                break;
            }
        }
    }

    public ArrayList<FDA> getFDA() {
        return fdas;
    }
}
