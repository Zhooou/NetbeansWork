/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author runyangzhou
 */
public class Airlines {
    private ArrayList<Fleet> fleetList;
    
    public Airlines(){
        this.fleetList = new ArrayList<>();
    }

    public ArrayList<Fleet> getFleetList() {
        return fleetList;
    }

    public void setFleetList(ArrayList<Fleet> fleetList) {
        this.fleetList = fleetList;
    }
    
//    public Fleet add(){
//        Fleet fleet = new Fleet();
//        
//        return fleet;
//    }
    
    public void delete(Fleet fleet){
        for(Plane p : fleet.getPlaneList()){
//            fleet.getPlaneList().remove(p);
//            fleet.delete(p);
        }
        fleetList.remove(fleet);
    }
    
    
}
