package com.BridgeLabz.AddressBook.Controller;

import com.BridgeLabz.AddressBook.Service.IAddressBookService;
import com.BridgeLabz.AddressBook.dto.AddressBookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    //Fetch all contacts From AddressBok
    @Autowired
    private IAddressBookService addressBookService;
    @RequestMapping(value= {"","/","get"})
    public ResponseEntity<String>getContact(){
        return new ResponseEntity<String>("call success", HttpStatus.OK);
    }

    //Fetch Contact From AddressBook By ID
    @GetMapping("/get/{Id}")
    public ResponseEntity<String>getContactById(@PathVariable("Id")int Id){
        return new ResponseEntity<String>("Call Success For Id: "+Id,HttpStatus.OK);
    }

    //Add New Contact In AddressBook
    @PostMapping("/addcontact")
    public ResponseEntity<String> addNewContact(@RequestBody AddressBookDTO addressBookDTO){
        return new ResponseEntity<String>("New Contact Created:"+ addressBookDTO,HttpStatus.OK);
    }

    //Update Contacts From AddressBook
    @PutMapping("/updatecontact")
    public ResponseEntity<String>updateContact(@RequestBody AddressBookDTO addressBookDTO){
        return new ResponseEntity<String>("Successfully updated Contact: "+addressBookDTO,HttpStatus.OK);
    }

    //Delete Contacts From AddressBook
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> deleteContact(@PathVariable("Id")int Id){
        return new ResponseEntity<String>("Contact Deleted: "+Id,HttpStatus.OK);
    }
}
