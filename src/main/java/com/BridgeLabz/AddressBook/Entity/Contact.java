package com.BridgeLabz.AddressBook.Entity;

public class Contact {
    private int Id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private int zipCode;
    private String state;
    private long contactNumber;
    private String emailId;

    public Contact(int id, String firstName, String lastName, String address, String city, int zipCode, String state, long contactNumber, String emailId) {
        Id = id;
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
        return "Contact{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
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
