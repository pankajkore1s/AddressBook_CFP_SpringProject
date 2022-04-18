package com.BridgeLabz.AddressBook.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddressBookDTO {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public int zipCode;
    public String state;
    public String contactNumber;
    public String emailId;

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                ", state='" + state + '\'' +
                ", contactNumber=" + contactNumber +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
