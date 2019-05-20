package ua.lviv.iot.Equipment.Equipment;


public class Thermometer extends Equipment {
    private String typeOfThermometer;


    public Thermometer() {

    }

    public Thermometer(final double price, final TypeOfEquipment height,
                       final EnumProducer producer, final int lenght) {
        super(price, height, producer, lenght);
    }

    public final String getTypeOfThermometer() {
        return typeOfThermometer;
    }

    public final void setTypeOfThermometer(final String typeOfThermometer) {
        this.typeOfThermometer = typeOfThermometer;
    }

}
