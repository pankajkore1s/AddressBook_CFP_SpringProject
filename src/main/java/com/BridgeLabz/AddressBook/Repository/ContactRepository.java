package com.BridgeLabz.AddressBook.Repository;

import com.BridgeLabz.AddressBook.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
