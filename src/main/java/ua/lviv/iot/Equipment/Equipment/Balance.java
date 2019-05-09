package ua.lviv.iot.Equipment.Equipment;

public class Balance extends Equipment {
    private int maxWeight;

    public Balance() {

    }

    public Balance(double price, TypeOfEquipment height, EnumProducer producer, int lenght) {
        super(price, height, producer, lenght);
    }

    public int getmaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}

