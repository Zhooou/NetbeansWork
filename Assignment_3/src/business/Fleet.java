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
public class Fleet {
    private ArrayList<Plane> planeList;
    private String fleetName;

    public Fleet() {
        this.planeList = new ArrayList<>();
    }
    public Fleet(String fleetName){
        this.fleetName = fleetName;
        this.planeList = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return this.fleetName;
    }
    
    public void delete(Plane plane){
        planeList.remove(plane);
    }
    
    public Plane add(){
        Plane plane = new Plane();
        planeList.add(plane);
        return plane;
    }

    public ArrayList<Plane> getPlaneList() {
        return planeList;
    }

    public void setPlaneList(ArrayList<Plane> planeList) {
        this.planeList = planeList;
    }

    public String getFleetName() {
        return fleetName;
    }

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    
}
