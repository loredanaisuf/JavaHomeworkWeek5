package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class iPhoneX extends Iphone {

    public iPhoneX(String culoare, String material, long imei) {
        super(culoare, material, imei);
        this.batteryLife = 25;
    }


    public void setColor(String color){
        this.color = color;
    }

    public int getBatteryLife(){
        return batteryLife;
    }

}
