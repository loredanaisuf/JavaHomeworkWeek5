package ro.siit;

public interface Phone {


    void addContact(String nrCrt, String number, String firstName, String lastName);
    void seeExistingContacts();
    void sendMessage(String phoneNumber, String message);
    void seeAllMassages();
    void makeCall(String phoneNumber);
    void seeAllCalls();
}
