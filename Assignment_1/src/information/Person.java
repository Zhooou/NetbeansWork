/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;

import java.sql.Date;

/**
 *
 * @author runyangzhou
 */
public class Person {
    String firstName;
    String lastName;
    String sex;
    String phoneNumber;
    Date birthday;
    Integer age;
    Double height;
    Double weight;
    Integer SSN;
    Address address;
    Account checkingAccount;
    Account savingAccount;
    DriverLisence driverLisence;
    MedicalRecord medicalRecord;

    public Person(){
//        this.address = new Address();
//        this.checkingAccount = new Account();
//        this.savingAccount = new Account();
//        this.driverLisence = new DriverLisence();
//        this.medicalRecord = new MedicalRecord();
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getSSN() {
        return SSN;
    }

    public void setSSN(Integer SSN) {
        this.SSN = SSN;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(Account checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public Account getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(Account savingAccount) {
        this.savingAccount = savingAccount;
    }

    public DriverLisence getDriverLisence() {
        return driverLisence;
    }

    public void setDriverLisence(DriverLisence driverLisense) {
        this.driverLisence = driverLisense;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    
    
    
}
