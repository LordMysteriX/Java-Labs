package main.java.ua.lviv.iot.Equipment.EquipmentManager;

import java.util.List;

import main.java.ua.lviv.iot.Equipment.Equipment.Equipment;
import main.java.ua.lviv.iot.Equipment.Equipment.TypeOfEquipment;
import main.java.ua.lviv.iot.Equipment.Equipment.EnumProducer;

public interface EquipmentManager {

    public List<Equipment> findByProducer(EnumProducer producer);

    public List<Equipment> findByHeight(TypeOfEquipment height);

    public List<Equipment> sortByPrice(boolean reverse);
}
