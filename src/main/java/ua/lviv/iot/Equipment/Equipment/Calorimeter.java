package ua.lviv.iot.Equipment.Equipment;


public class Calorimeter extends Equipment {
    private int volume;

    public Calorimeter() {

    }

    public Calorimeter(final double price, final TypeOfEquipment height,
                       final EnumProducer producer, final int lenght) {
        super(price, height, producer, lenght);
    }

    public final int getVolume() {
        return volume;
    }

    public final void setVolume(final int volume) {
        this.volume = volume;
    }
}
