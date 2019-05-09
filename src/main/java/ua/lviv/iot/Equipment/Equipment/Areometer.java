package main.java.ua.lviv.iot.Equipment.Equipment;

public class Areometer extends Equipment {
    private int lenght;

    public Areometer() {

    }

    public Areometer(double price, TypeOfEquipment height,
                     EnumProducer producer, int lenght) {
        super(price, height, producer, lenght);
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
