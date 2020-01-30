package ro.siit;

import java.util.ArrayList;
import java.util.List;

public abstract class Iphone implements Phone {
    protected List<Contact> contacts=new ArrayList<>();

    @Override
    public void addContact(int nrCrt, String number, String firstName, String lastName) {
        Contact contact=new Contact(nrCrt, number, firstName,lastName);
        contacts.add(contact);
    }

    @Override
    public void seeExistingContacts() {
        for(Contact contact:contacts)
            System.out.println(contact);
    }
}
