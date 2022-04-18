package com.BridgeLabz.AddressBook.Controller;

import com.BridgeLabz.AddressBook.Entity.Contact;
import com.BridgeLabz.AddressBook.Service.IAddressBookService;
import com.BridgeLabz.AddressBook.dto.AddressBookDTO;
import com.BridgeLabz.AddressBook.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    //Fetch all contacts From AddressBok
    @Autowired
    IAddressBookService addressBookService;
    @RequestMapping(value= {"","/","get"})
    public ResponseEntity<String>getContact(){
        List<Contact> contactList=addressBookService.getContact();
        ResponseDTO responseDTO=new ResponseDTO("get call success",contactList);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }

    //Fetch Contact From AddressBook By ID
    @GetMapping("/get/{Id}")
    public ResponseEntity<String>getContactById(@PathVariable("Id")int Id){
        Contact contact=addressBookService.getContactById(Id);
        ResponseDTO responseDTO=new ResponseDTO("get call success for Id",contact);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
    }

    //Add New Contact In AddressBook
    @PostMapping("/addcontact")
    public ResponseEntity<String> addNewContact(@RequestBody AddressBookDTO addressBookDTO){
        Contact contact=addressBookService.addNewContact(addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("Successfully Added New Contact",contact);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
    }

    //Update Contacts From AddressBook
    @PutMapping("/updatecontact")
    public ResponseEntity<String>updateContact(@PathVariable ("Id")int Id,@RequestBody AddressBookDTO addressBookDTO){
        Contact contact=addressBookService.updateContact(Id,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("Successfully Updated Contact",contact);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
    }

    //Delete Contacts From AddressBook
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> deleteContact(@PathVariable("Id")int Id){
        Contact contact=null;
        addressBookService.deleteContact(Id);
        ResponseDTO responseDTO=new ResponseDTO("Contact Deleted Successfully "+Id,contact);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
    }
}
