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
public class FlightCatalog {
    private ArrayList<Flight> flightList;

    public FlightCatalog() {
        this.flightList = new ArrayList<>();
    }
    
    public void addFlight(Flight flight){
        flightList.add(flight);
    }
    
    public Flight addFlight(){
        Flight flight = new Flight();
        flightList.add(flight);
        return flight;
    }
    
    public void delete(Flight flight){
        flightList.remove(flight);
    }
    
    public ArrayList<Flight> getFlightList() {
        return flightList;
    }
    
    

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
}
