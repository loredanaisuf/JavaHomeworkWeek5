package ro.siit;

import java.util.ArrayList;
import java.util.List;

public abstract class Samsung implements Phone {
    protected List<Contact> contacts=new ArrayList<>();
    protected String culoare;
    protected String material;
    protected long imei;
    protected int batteryLife=30;

    public Samsung(String culoare, String material, long imei) {
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
    public List<Contact> seeExistingContacts() {
        List<Contact> auxContacts=new ArrayList<>();
        for(Contact c : contacts)
            auxContacts.add(c);
        return auxContacts;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getBatteryLife(){
        return batteryLife;
    }
}

