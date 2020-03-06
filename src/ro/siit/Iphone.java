package ro.siit;

import java.util.ArrayList;
import java.util.List;

public abstract class Iphone implements Phone {
    protected List<Contact> contacts=new ArrayList<>();
    protected String culoare;
    protected String material;
    protected long imei;
    int bateryLife=24;

    public Iphone(String culoare, String material, long imei) {
        this.culoare = culoare;
        this.material = material;
        this.imei = imei;
    }

    @Override
    public void addContact(String nrCrt, String number, String firstName, String lastName) {
        Contact contact=new Contact(nrCrt, number, firstName,lastName);
        contacts.add(contact);
    }

    @Override
    public void seeExistingContacts() {
        for(Contact contact:contacts)
            System.out.println(contact);
    }
}
