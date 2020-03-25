package ro.siit;

import java.util.List;

public interface Phone {


    void addContact(String nrCrt, String number, String firstName, String lastName);
    List<Contact> seeExistingContacts();
    void sendMessage(String phoneNumber, String message);
    List<Message> seeAllMassages();
    void makeCall(String phoneNumber);
    List<String> seeAllCalls();
    int getBatteryLife();
}
