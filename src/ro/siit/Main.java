package ro.siit;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new iPhone7("pink","metal",574544);

        System.out.println("Initial battery life: " + phone1.getBatteryLife());
        phone1.addContact("1", "0761142632", "Loredana", "Isuf");
        phone1.addContact("2", "0769010203", "Maria", "Isuf");
        System.out.println(phone1.seeExistingContacts());

        System.out.println("send a message to the first contact from the previous listed");
        // max number of characters - 100
        phone1.sendMessage("0761142632", "How are you?");
        System.out.println(phone1.seeAllMassages());

        System.out.println("send a message to the second contact from the previous listed");
        phone1.sendMessage("0769010203", "How was your journey");
        System.out.println(phone1.seeAllMassages());

        System.out.println("make a call to the second contact from the previous listed");
        phone1.makeCall("0761142632");
        System.out.println(phone1.seeAllCalls());

        System.out.println("Actually battery life: " + phone1.getBatteryLife());

        System.out.println("..........................................................................");

        Phone phone2 = new iPhoneX("white","metal",500000);

        System.out.println("Initial battery life: " + phone2.getBatteryLife());
        phone2.addContact("1", "0761142632", "Loredana", "Isuf");
        phone2.addContact("2", "0766407591", "Alin", "Vaduva");
        System.out.println(phone2.seeExistingContacts());

        System.out.println("send a message to the first contact from the previous listed");
        // max number of characters - 100
        phone2.sendMessage("0761142632", "How was your day?");
        System.out.println(phone2.seeAllMassages());

        System.out.println("send a message to the second contact from the previous listed");
        phone2.sendMessage("0766407591", "What time did you start yesterday?");
        System.out.println(phone2.seeAllMassages());

        System.out.println("make a call to the second contact from the previous listed");
        phone2.makeCall("0766407591");
        System.out.println(phone2.seeAllCalls());

        System.out.println("Actually battery life: " + phone2.getBatteryLife());

        System.out.println("......................................................................");

        Phone phone3 = new SamsungS6("white","metal",500000);

        System.out.println("Initial battery life: " + phone3.getBatteryLife());
        phone3.addContact("1", "0761163211", "Adelina", "Motorga");
        phone3.addContact("2", "0766407522", "Oana", "Milcu");
        System.out.println(phone3.seeExistingContacts());

        System.out.println("send a message to the first contact from the previous listed");
        // max number of characters - 100
        phone3.sendMessage("0761163211", "message content");
        System.out.println(phone3.seeAllMassages());

        System.out.println("send a message to the second contact from the previous listed");
        phone3.sendMessage("0766407522", "message more content");
        System.out.println(phone3.seeAllMassages());

        System.out.println("make a call to the second contact from the previous listed");
        phone3.makeCall("0766407522");
        System.out.println(phone3.seeAllCalls());

        System.out.println("Actually battery life: " + phone3.getBatteryLife());

        System.out.println("......................................................................");

        Phone phone4 = new SamsungS6("white","metal",500000);

        System.out.println("Initial battery life: " + phone4.getBatteryLife());
        phone4.addContact("1", "0761163215", "Ilie", "Isuf");
        phone4.addContact("2", "0766407501", "Alin", "Vaduva");
        System.out.println(phone4.seeExistingContacts());

        System.out.println("send a message to the first contact from the previous listed");
        // max number of characters - 100
        phone4.sendMessage("0761163215", "How are you?");
        System.out.println(phone4.seeAllMassages());

        System.out.println("send a message to the second contact from the previous listed");
        phone4.sendMessage("0766407201", "How are you?");
        System.out.println(phone4.seeAllMassages());

        System.out.println("make a call to the second contact from the previous listed");
        phone4.makeCall("0766407501");
        System.out.println(phone4.seeAllCalls());

        System.out.println("Actually battery life: " + phone4.getBatteryLife());

    }
}
