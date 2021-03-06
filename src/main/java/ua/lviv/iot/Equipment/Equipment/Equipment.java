package ua.lviv.iot.Equipment.Equipment;


public class Equipment  {

    private double price;
    private TypeOfEquipment height;
    private EnumProducer producer;
    private int lenght;

    @Override
    public String toString() {
        return "Items: Price = " + price
                + ", height = " + height
                + ", Producer = " + producer
                + ", Lenght = " + lenght;

    }

    public Equipment() {

    }

    public Equipment(final double price, final TypeOfEquipment height,
                     final EnumProducer producer, final int lenght) {
        this.price = price;
        this.height = height;
        this.producer = producer;
        this.lenght = lenght;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final TypeOfEquipment getHeight() {
        return height;
    }

    public final void setHeight(final TypeOfEquipment height) {
        this.height = height;
    }

    public final EnumProducer getProducer() {
        return producer;
    }

    public final void setProducer(final EnumProducer producer) {
        this.producer = producer;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(final int lenght) {
        this.lenght = lenght;

    }

    public String getHeaders(){
        return "price: " + price + ", "
                + "height: " + height + ", "
                +"producer: " + producer + ", "
                +"lenght: " + lenght + ", ";
    }

    public String toCSV(){
        return "price: " + price + ", "
                + "height: " + height + ", "
                +"producer: " + producer + ", "
                +"lenght: " + lenght + ", ";
    }
}
