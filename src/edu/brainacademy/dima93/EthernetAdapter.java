package edu.brainacademy.dima93;

public class EthernetAdapter extends Device{

    int speed;
    String mac;

    public EthernetAdapter(String manufacturer,
                           float price, String serialNumber,
                           int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }


    

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getMac() {
        return mac;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }
}
