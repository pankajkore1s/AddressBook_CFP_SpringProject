package com.BridgeLabz.AddressBook.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class AddressBookDTO {
    @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{2,}",message = "enter valid firstName")
    public String firstName;
    @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{2,}",message = "enter valid lastName")
    public String lastName;
    @NotEmpty(message = "Address can not be empty.")
    public String address;
    @NotEmpty(message = "Address can not be empty.")
    public String city;
    //@Pattern(regexp = "^[0-9]{6}$",message = "Zipcode must contain 6 Digits!")
    //@NotEmpty(message = "zipCode can not be empty.")
    public int zipCode;
    @NotEmpty(message = "Address can not be empty.")
    public String state;
    @Pattern(regexp = "^[0-9\\s]{2}[0-9]{3,}$",message = "contactNumber must contain 12 Digits only.")
    public String contactNumber;
    //@Pattern(regexp = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$",message = "Enter Valid EmailId!")
    @NotEmpty(message = "EmailId can not be empty.")
    public String emailId;

    public AddressBookDTO(String firstName, String lastName, String address, String city, int zipCode, String state, String contactNumber, String emailId) {
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
