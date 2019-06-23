package ua.lviv.iot.Equipment.Equipment;

public class Areometer extends Equipment {
    private int volume;


    public Areometer() {

    }

    public Areometer(final double price, final TypeOfEquipment height,
                     final EnumProducer producer, final int lenght, int volume) {
        super(price, height, producer, lenght);
        this.volume = volume;

    }

    public final int getLenght() {
        return volume;
    }

    public final void setLenght(final int volume) {
        this.volume = volume;
    }

    @Override
    public String getHeaders(){
        return super.getHeaders() + "," + "volume";

    }

    public String toCSV(){
        return super.toCSV() + "," + volume;
    }
}

