package com.vpetrou.cs.soap.service;

import com.vpetrou.cs.model.Contact;

import java.util.List;

public interface ContactService {
     List<Contact> getAllContacts();
     Contact getContactByEmail(String email);
     List<Contact> getContactByName(String name);
     boolean addContact(Contact contact);
     void updateContact(Contact contact);
     void deleteContact(Contact contact);
}
