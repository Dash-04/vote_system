package com.vote_application.voteapp.web.dto;

import jakarta.persistence.Column;

public class UserRegistrationDto {

    private int vin;
    private String FirstName;
    private String LastName;
    private int PhoneNumber;
    private String Password;
    private String RePassword;


    public UserRegistrationDto(int vin, String firstName, String lastName, int phoneNumber, String password, String rePassword) {
        this.vin = vin;
        FirstName = firstName;
        LastName = lastName;
        PhoneNumber = phoneNumber;
        Password = password;
        RePassword = rePassword;
    }

    public UserRegistrationDto() {

    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = Integer.parseInt(phoneNumber);
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRePassword() {
        return RePassword;
    }

    public void setRePassword(String rePassword) {
        RePassword = rePassword;
    }
}
