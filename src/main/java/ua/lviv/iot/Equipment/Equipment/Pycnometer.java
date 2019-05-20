package ua.lviv.iot.Equipment.Equipment;

public class Pycnometer extends Equipment {
    private double accuracy;
    private String material;

    public Pycnometer() {

    }

    public Pycnometer(final double price, final TypeOfEquipment height,
                      final EnumProducer producer, final int lenght) {
        super(price, height, producer, lenght);
    }

    public final double getAccuracy() {
        return accuracy;
    }

    public final void setAccuracy(final double accuracy) {
        this.accuracy = accuracy;
    }

    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(final String material) {
        this.material = material;
    }


}
