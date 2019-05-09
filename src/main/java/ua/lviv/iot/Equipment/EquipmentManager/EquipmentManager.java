package ua.lviv.iot.Equipment.EquipmentManager;

import java.util.List;

import ua.lviv.iot.Equipment.Equipment.Equipment;
import ua.lviv.iot.Equipment.Equipment.TypeOfEquipment;
import ua.lviv.iot.Equipment.Equipment.EnumProducer;

public interface EquipmentManager {

    List<Equipment> findByProducer(EnumProducer producer);

    List<Equipment> findByHeight(TypeOfEquipment height);

    List<Equipment> sortByPrice(boolean reverse);
}

