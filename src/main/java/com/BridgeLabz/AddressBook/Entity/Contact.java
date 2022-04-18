package com.BridgeLabz.AddressBook.Entity;

import com.BridgeLabz.AddressBook.dto.AddressBookDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private int zipCode;
    private String state;
    private String contactNumber;
    private String emailId;

    public Contact(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.firstName=addressBookDTO.firstName;
        this.lastName=addressBookDTO.lastName;
        this.address=addressBookDTO.address;
        this.city =addressBookDTO.city;
        this.zipCode =addressBookDTO.zipCode;
        this.state =addressBookDTO.state;
        this.contactNumber =addressBookDTO.contactNumber;
        this.emailId = addressBookDTO.emailId;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Id=" + id +
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
