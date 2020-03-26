package ro.siit;

public class SamsungA40 extends Samsung{
    public SamsungA40(String culoare, String material, long imei) {
        super(culoare, material, imei);
        this.batteryLife = 30;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getBatteryLife(){
        return batteryLife;
    }
}
