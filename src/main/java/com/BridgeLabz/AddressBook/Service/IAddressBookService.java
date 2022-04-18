package com.BridgeLabz.AddressBook.Service;

import com.BridgeLabz.AddressBook.Entity.Contact;
import com.BridgeLabz.AddressBook.dto.AddressBookDTO;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getContact();

    Contact getContactById(int Id);

    Contact addNewContact(AddressBookDTO addressBookDTO);

    Contact updateContact(int Id,AddressBookDTO addressBookDTO);

    void deleteContact(int Id);
}
