package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class iPhone7 extends Iphone {
    List<Message> messages = new ArrayList<>();
    List<String> calls = new ArrayList<>();

    public iPhone7(String culoare, String material, long imei) {
        super(culoare, material, imei);
        this.batteryLife = 20;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getBatteryLife(){
        return batteryLife;
    }
}
