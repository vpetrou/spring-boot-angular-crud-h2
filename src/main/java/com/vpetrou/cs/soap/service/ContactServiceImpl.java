package com.vpetrou.cs.soap.service;


import com.vpetrou.cs.model.Contact;
import com.vpetrou.cs.rest.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact getContactByEmail(String email) {
        Contact obj = contactRepository.findByEmail(email);
        return obj;
    }

    @Override
    public List<Contact> getContactByName(String title) {
        List<Contact> list = new ArrayList<>();
        contactRepository.findByNameIgnoreCaseContaining(title).forEach(e -> list.add(e));
        return list;
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> list = new ArrayList<>();
        contactRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public synchronized boolean addContact(Contact contact) {
        if (contactRepository.countByEmail(contact.getEmail()) == 0) {
            contactRepository.save(contact);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void updateContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contactRepository.delete(contact);
    }
}
