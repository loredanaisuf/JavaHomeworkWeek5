package ro.siit;

public interface Phone {
    void addContact(int nrCrt, String number, String firstName, String lastName);
    void seeExistingContacts();
    void sendMessage();
    void seeAllMassages();
    void makeCall();
    void seeAllCalls();
}
