package ua.lviv.iot.Equipment.Equipment;

public class Areometer extends Equipment {
    private int lenght;

    public Areometer() {

    }

    public Areometer(final double price, final TypeOfEquipment height,
                     final EnumProducer producer, final int lenght) {
        super(price, height, producer, lenght);
    }

    public final int getLenght() {
        return lenght;
    }

    public final void setLenght(final int lenght) {
        this.lenght = lenght;
    }
}

