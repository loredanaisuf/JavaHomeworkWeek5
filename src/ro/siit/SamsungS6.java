package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class SamsungS6 extends Samsung {

    public SamsungS6(String culoare, String material, long imei) {
        super(culoare, material, imei);
        this.batteryLife = 24;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getBatteryLife(){
        return batteryLife;
    }
}
