package com.BridgeLabz.AddressBook.Service;

import com.BridgeLabz.AddressBook.Entity.Contact;
import com.BridgeLabz.AddressBook.dto.AddressBookDTO;

import java.util.List;
import java.util.Optional;

public interface IAddressBookService {
    List<Contact> getContact();

    Contact getContactById(long id);

    Contact addNewContact(AddressBookDTO responseDTO);

    Contact updateContact(long id, AddressBookDTO addressBookDTO);

    void deleteContact(long id);
}
