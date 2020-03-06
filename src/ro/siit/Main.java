package ro.siit;

public class Main {

    public static void main(String[] args) {
        Phone phone = new iPhone7("pink","metal",574544);

        phone.addContact("1", "phone number", "fist name", "last name");
        phone.addContact("2", "phone number", "fist name", "last name");
        phone.seeExistingContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendMessage("phone number", "message content");
        phone.seeAllMassages();

        // send a message to the second contact from the previous listed
        phone.makeCall("phone number");
        phone.seeAllCalls();

    }
}
