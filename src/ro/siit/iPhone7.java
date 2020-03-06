package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class iPhone7 extends Iphone {
    List<Message> messages=new ArrayList<>();

    public iPhone7(String culoare, String material, long imei) {
        super(culoare, material, imei);
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        Message msg=new Message(phoneNumber,message);
        messages.add(msg);
        bateryLife--;
    }

    @Override
    public void seeAllMassages() {
        for(Message m:messages)
            System.out.println(m);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("you will make a call");
    }

    @Override
    public void seeAllCalls() {
        System.out.println("Calls");
    }
}
