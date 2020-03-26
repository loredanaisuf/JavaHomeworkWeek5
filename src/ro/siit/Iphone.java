package ro.siit;

import java.util.ArrayList;
import java.util.List;

public abstract class Iphone implements Phone {
    protected List<Contact> contacts=new ArrayList<>();
    protected String color;
    protected String material;
    protected long imei;
    protected int batteryLife;
    protected List<Message> messages = new ArrayList<>();
    protected List<String> calls = new ArrayList<>();

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

    @Override
    public void sendMessage(String phoneNumber, String message) {
        if(message.length()<500) {
            Message msg = new Message(phoneNumber, message);
            messages.add(msg);
            batteryLife--;
        } else{
            System.out.println("The message must be lower than 500 characters");
        }
    }

    @Override
    public List<Message> seeAllMassages() {
        List<Message> auxMessages =  new ArrayList<>();
        for(Message m:messages)
            auxMessages.add(m);
        return auxMessages;
    }

    @Override
    public void makeCall(String phoneNumber) {
        calls.add(phoneNumber);
        batteryLife -=2;
    }

    @Override
    public List<String> seeAllCalls() {
        List<String> auxCalls = new ArrayList<>();
        for(String c : calls)
            auxCalls.add(c);
        return auxCalls;
    }
}
