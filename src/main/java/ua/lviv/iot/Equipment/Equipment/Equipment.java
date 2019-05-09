package main.java.ua.lviv.iot.Equipment.Equipment;

import main.java.ua.lviv.iot.Equipment.Main;

public class Equipment extends Main {

    private double price;
    private TypeOfEquipment height;
    private EnumProducer producer;
    private int lenght;

    @Override
    public String toString() {
        return "Items: Price = " + price +
                ", height = " + height +
                ", Producer = " + producer +
                ", Lenght = " + lenght;

    }

    public Equipment() {

    }

    public Equipment(double price, TypeOfEquipment height, EnumProducer producer, int lenght) {
        this.price = price;
        this.height = height;
        this.producer = producer;
        this.lenght = lenght;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TypeOfEquipment getHeight() {
        return height;
    }

    public void setHeight(TypeOfEquipment height) {
        this.height = height;
    }

    public EnumProducer getProducer() {
        return producer;
    }

    public void setProducer(EnumProducer producer) {
        this.producer = producer;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
