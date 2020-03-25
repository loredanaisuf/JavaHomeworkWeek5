package ro.siit;

import java.util.ArrayList;
import java.util.List;

public abstract class Iphone implements Phone {
    protected List<Contact> contacts=new ArrayList<>();
    protected String color;
    protected String material;
    protected long imei;
    protected int batteryLife=24;

    public Iphone(String color, String material, long imei) {
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    @Override
    public void addContact(String nrCrt, String number, String firstName, String lastName) {
        Contact contact=new Contact(nrCrt, number, firstName,lastName);
        contacts.add(contact);
    }

    @Override
    public List<Contact> seeExistingContacts() {
        List<Contact> auxContacts=new ArrayList<>();
        for(Contact c : contacts)
            auxContacts.add(c);
        return auxContacts;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getBatteryLife(){
        return batteryLife;
    }
}
