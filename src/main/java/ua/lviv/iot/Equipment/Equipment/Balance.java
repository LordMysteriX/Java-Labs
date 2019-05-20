package ua.lviv.iot.Equipment.Equipment;

public class Balance extends Equipment {
    private int maxWeight;

    public Balance() {

    }

    public Balance(final double price, final TypeOfEquipment height,
                   final EnumProducer producer, final int lenght) {
        super(price, height, producer, lenght);
    }

    public final int getmaxWeight() {
        return maxWeight;
    }

    public final void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}

