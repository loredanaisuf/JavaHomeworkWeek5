package ro.siit;

public class Main {

    public static void main(String[] args) {
        Phone phone = new iPhone7("pink","metal",574544);

        System.out.println("Initial battery life: " + phone.getBatteryLife());
        phone.addContact("1", "phone number1", "fist name 1", "last name 1");
        phone.addContact("2", "phone number2", "fist name 2", "last name 2");
        System.out.println(phone.seeExistingContacts());

        System.out.println("send a message to the first contact from the previous listed");
        // max number of characters - 100
        phone.sendMessage("phone number1", "message content");
        System.out.println(phone.seeAllMassages());

        System.out.println("send a message to the second contact from the previous listed");
        phone.sendMessage("phone number2", "message dcds content");
        System.out.println(phone.seeAllMassages());

        System.out.println("make a call to the second contact from the previous listed");
        phone.makeCall("phone number2");
        System.out.println(phone.seeAllCalls());

        System.out.println("Actually battery life: " + phone.getBatteryLife());

    }
}
