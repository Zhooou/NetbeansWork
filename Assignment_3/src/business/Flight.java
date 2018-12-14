/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author runyangzhou
 */
public class Flight {
    private Plane plane;
    private int[][] seats = new int[25][6];
    private int avilSeats;
    private Date departureDate;
    private String departureAirport;
    private String arrivalAirport;
    
    public Flight(){
        
    }
    
    public Flight(Plane plane, Date departureDate, String departureAirport, String arrivalAirport) {
        this.plane = plane;
        this.departureDate = departureDate;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public int[][] getSeats() {
        return seats;
    }

    public void setSeats(int[][] seats) {
        this.seats = seats;
    }

    public int getAvilSeats() {
        return avilSeats;
    }

    public void setAvilSeats(int avilSeats) {
        this.avilSeats = avilSeats;
    }
    
    @Override
    public String toString(){
        return plane.getSerialNum();
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        for(int i = 0; i < 25; i++)
            for(int j = 0; j < 6; j++)
                seats[i][j] = 1;
        this.avilSeats = plane.getSeats();
        this.plane = plane;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
    
    
    
}
