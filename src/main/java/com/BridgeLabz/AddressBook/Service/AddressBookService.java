package com.BridgeLabz.AddressBook.Service;

import com.BridgeLabz.AddressBook.Entity.Contact;
//import com.BridgeLabz.AddressBook.Exception.AddressBookException;
import com.BridgeLabz.AddressBook.Repository.ContactRepository;
import com.BridgeLabz.AddressBook.dto.AddressBookDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getContact(){
        return contactRepository.findAll();
    }

    @Override
    public Contact getContactById(long id){
       return contactRepository.findById(id);
               //.orElseThrow(()->new AddressBookException("contact with this id doesn't exist"));
    }

    @Override
    public Contact addNewContact(AddressBookDTO addressBookDTO){
        Contact contact=null;
        contact=new Contact(addressBookDTO);
        log.debug("Contact :"+contact.toString());
        return contactRepository.save(contact);
    }

    @Override
    public Contact updateContact(long id, AddressBookDTO addressBookDTO) {
        Contact contact=this.getContactById(id);
        contact.updateContact(addressBookDTO);
        return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(long id){
        Contact contact=this.getContactById(id);
        contactRepository.delete(contact);
    }
}
