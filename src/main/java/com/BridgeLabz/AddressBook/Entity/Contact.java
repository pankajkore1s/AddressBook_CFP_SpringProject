package com.BridgeLabz.AddressBook.Entity;

import com.BridgeLabz.AddressBook.dto.AddressBookDTO;

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

    public Contact(int id, AddressBookDTO addressBookDTO) {
        this.Id = id;
        this.firstName =addressBookDTO.firstName;
        this.lastName =addressBookDTO.lastName;
        this.address =addressBookDTO.address;
        this.city =addressBookDTO.city;
        this.zipCode =addressBookDTO.zipCode;
        this.state =addressBookDTO.state;
        this.contactNumber =addressBookDTO.contactNumber;
        this.emailId =addressBookDTO.emailId;
    }
    public Contact(){

    }
}
