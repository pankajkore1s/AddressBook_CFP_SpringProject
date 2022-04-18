package com.BridgeLabz.AddressBook.dto;

public class AddressBookDTO {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public int zipCode;
    public String state;
    public long contactNumber;
    public String emailId;

    public AddressBookDTO(String firstName, String lastName, String address, String city, int zipCode, String state, long contactNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
    }

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
