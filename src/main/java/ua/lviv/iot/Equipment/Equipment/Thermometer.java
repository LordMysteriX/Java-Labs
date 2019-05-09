package main.java.ua.lviv.iot.Equipment.Equipment;

public class Thermometer extends Equipment {
    private String typeOfThermometer;


    public Thermometer() {

    }

    public Thermometer(double price, TypeOfEquipment height, EnumProducer producer, int lenght) {
        super(price, height, producer, lenght);
    }

    public String getTypeOfThermometer() {
        return typeOfThermometer;
    }

    public void setTypeOfThermometer(String typeOfThermometer) {
        this.typeOfThermometer = typeOfThermometer;
    }

}
