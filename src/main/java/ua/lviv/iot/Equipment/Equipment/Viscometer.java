package ua.lviv.iot.Equipment.Equipment;

public class Viscometer extends Equipment {
    private int mistake;

    public Viscometer() {

    }

    public Viscometer(final double price, final TypeOfEquipment height,
                      final EnumProducer producer, final int lenght) {
        super(price, height, producer, lenght);
    }

    public final int getMistake() {
        return mistake;
    }

    public final void setMistake(final int mistake) {
        this.mistake = mistake;
    }
}
