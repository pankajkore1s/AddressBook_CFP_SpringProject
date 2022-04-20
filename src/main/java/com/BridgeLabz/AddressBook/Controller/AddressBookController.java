package com.BridgeLabz.AddressBook.Controller;

import com.BridgeLabz.AddressBook.Entity.Contact;
import com.BridgeLabz.AddressBook.Service.IAddressBookService;
import com.BridgeLabz.AddressBook.dto.AddressBookDTO;
import com.BridgeLabz.AddressBook.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/addressbook")
public class AddressBookController {
    //Fetch all contacts From AddressBok
    @Autowired
    private IAddressBookService addressBookService;
    @RequestMapping(value= {"","/","get"})
    public ResponseEntity<ResponseDTO>getContact(){
        List<Contact> contactList=null;
        contactList=addressBookService.getContact();
        ResponseDTO responseDTO=new ResponseDTO("get call success",contactList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //Fetch Contact From AddressBook By ID
    @GetMapping("/get/{id}")
    public ResponseEntity<String>getContactById(@PathVariable("id")long id){
        Contact contact=null;
        contact=addressBookService.getContactById(id);
        ResponseDTO responseDTO=new ResponseDTO("get call success for Id",contact);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
    }

    //Add New Contact In AddressBook
    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> addNewContact(@Valid @RequestBody AddressBookDTO addressBookDTO){
        Contact contact=null;
        contact=addressBookService.addNewContact(addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("Successfully Added New Contact",contact);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    //Update Contacts From AddressBook
    @PutMapping("/updatecontact/{id}")
    public ResponseEntity<ResponseDTO>updateContact(@Valid @PathVariable ("id")long id,@RequestBody AddressBookDTO addressBookDTO){
        Contact contact=null;
        contact=addressBookService.updateContact(id,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("Successfully Updated Contact",contact);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    //Delete Contacts From AddressBook
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable("id")long id){
        Contact contact=null;
        addressBookService.deleteContact(id);
        ResponseDTO responseDTO=new ResponseDTO("Contact Deleted Successfully "+id,contact);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
    }
}
