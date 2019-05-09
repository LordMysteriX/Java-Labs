package main.java.ua.lviv.iot.Equipment.Equipment;

public class Viscometer extends Equipment {
    private int mistake;

    public Viscometer() {

    }

    public Viscometer(double price, TypeOfEquipment height, EnumProducer producer, int lenght) {
        super(price, height, producer, lenght);
    }

    public int getMistake() {
        return mistake;
    }

    public void setMistake(int mistake) {
        this.mistake = mistake;
    }
}
