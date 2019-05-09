package main.java.ua.lviv.iot.Equipment.Equipment;

public class Calorimeter extends Equipment {
    private int volume;

    public Calorimeter() {

    }

    public Calorimeter(double price, TypeOfEquipment height, EnumProducer producer, int lenght) {
        super(price, height, producer, lenght);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
