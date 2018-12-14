/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author runyangzhou
 */
public class Plane {
    String serialNum;
    String model;
    int seats;
    
    public Plane(){
    }
    
    public Plane(String serialNum, String model, int seats) {
        this.serialNum = serialNum;
        this.model = model;
        this.seats = seats;
    }
    
    @Override
    public String toString(){
        return this.getSerialNum();
    }
    
    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    
    
}
