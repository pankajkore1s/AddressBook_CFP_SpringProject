package com.BridgeLabz.AddressBook.Entity;

import com.BridgeLabz.AddressBook.dto.AddressBookDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;



@Getter
@Setter
@Entity
@Table(name="contactsDB")
public @Data class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String address;
    private String city;
    private int zipCode;
    private String state;
    private String contactNumber;
    private String emailId;

    @ElementCollection
    @CollectionTable(name="addressBook",joinColumns = @JoinColumn(name="id"))
    private List<String> department;

    public Contact() {
    }

    public Contact(AddressBookDTO addressBookDTO){
        this.updateContact(addressBookDTO);
    }

    public void updateContact(AddressBookDTO addressBookDTO){
        this.firstName=addressBookDTO.firstName;
        this.lastName=addressBookDTO.lastName;
        this.address=addressBookDTO.address;
        this.city =addressBookDTO.city;
        this.zipCode =addressBookDTO.zipCode;
        this.state =addressBookDTO.state;
        this.contactNumber =addressBookDTO.contactNumber;
        this.emailId = addressBookDTO.emailId;
    }


}
