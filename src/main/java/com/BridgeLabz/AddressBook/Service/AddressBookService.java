package com.BridgeLabz.AddressBook.Service;

import com.BridgeLabz.AddressBook.Entity.Contact;
import com.BridgeLabz.AddressBook.dto.AddressBookDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{
    @Override

    public List<Contact> getContact(){
        List<Contact> contactList=new ArrayList<>();
        contactList.add(new Contact(1,new AddressBookDTO("Pankaj","Kore","Anand-Nagar","Latur",413512,"Maharashtra","8149498627","bridge@gmail.com")));
        return contactList;
    }

    @Override
    public Contact getContactById(int Id){
        Contact contactList=null;
        contactList=new Contact(1,new AddressBookDTO("Pankaj","Kore","Anand-Nagar","Latur",413512,"Maharashtra","8149498627","bridge@gmail.com"));
        return contactList;
    }

    @Override
    public Contact addNewContact(AddressBookDTO addressBookDTO){
        return new Contact(1,addressBookDTO);
    }

    @Override
    public Contact updateContact(int Id,AddressBookDTO addressBookDTO){
       return new Contact(1,addressBookDTO);
    }

    @Override
    public void deleteContact(int Id){

    }


}
