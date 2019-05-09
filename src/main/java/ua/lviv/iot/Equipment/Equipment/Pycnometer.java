package main.java.ua.lviv.iot.Equipment.Equipment;

public class Pycnometer extends Equipment {
    private double accuracy;
    private String material;

    public Pycnometer() {

    }

    public Pycnometer(double price, TypeOfEquipment height, EnumProducer producer, int lenght) {
        super(price, height, producer, lenght);
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


}

