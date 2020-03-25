package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class iPhone7 extends Iphone {
    List<Message> messages = new ArrayList<>();
    List<String> calls = new ArrayList<>();

    public iPhone7(String culoare, String material, long imei) {
        super(culoare, material, imei);
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        Message msg=new Message(phoneNumber,message);
        messages.add(msg);
        batteryLife--;
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
