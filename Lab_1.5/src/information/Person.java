/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;

/**
 *
 * @author runyangzhou
 */
public class Person {
    
    String firstName;
    String lastName;
    String birthday;
    Address local;
    Address home;
    Address work;
    
    public Person(){
        
    }
    
    public Person(String firstName, String lastName, String birthday, Address local, Address home, Address work) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.local = local;
        this.home = home;
        this.work = work;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Address getLocal() {
        return local;
    }

    public void setLocal(Address local) {
        this.local = local;
    }

    public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    public Address getWork() {
        return work;
    }

    public void setWork(Address work) {
        this.work = work;
    }
    
    @Override
    public String toString(){
        return "First Name:"+this.firstName+"   Last Name:"+this.lastName + "Birthday:" + this.birthday + "\n"
                + "Local: \n" + local.getLine1() + local.getLine2() + local.getCity() + local.getState() + local.getCountry()+ local.getZipcode();
    }
    
}
