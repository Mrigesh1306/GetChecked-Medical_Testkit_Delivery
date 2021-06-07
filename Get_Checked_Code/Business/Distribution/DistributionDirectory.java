/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distribution;

import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class DistributionDirectory {
    private ArrayList<Distribution> distributions;
    
    public DistributionDirectory(){
        distributions = new ArrayList();
    }
    
    public Distribution createDistributionUnit(String name){
        for(Distribution distribution: distributions){
            if(distribution.getDistributionName().equals(name)){
                return null;
            }
        }
        Distribution distribution = new Distribution(name);
        this.distributions.add(distribution);
        return distribution;
    }
    
    //public void deleteDistributionUnit(String name){
      //  for(Distribution distribution: distributions){
        //    if(distribution.getDistributionName().equals(name)){
          //      distributions.remove(name);
            //    break;
            //}
        //}
    //}
    
    public void deleteDistributionUnit(Distribution dist){
        distributions.remove(dist);
    }
    
    public ArrayList<Distribution> getDistributions() {
        return distributions;
    }
}
