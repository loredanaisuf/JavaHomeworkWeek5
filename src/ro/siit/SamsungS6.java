package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class SamsungS6 extends Samsung {
    List<Message> messages = new ArrayList<>();
    List<String> calls = new ArrayList<>();

    public SamsungS6(String culoare, String material, long imei) {
        super(culoare, material, imei);
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
