package ua.lviv.iot.Equipment.EquipmentManager;

import java.util.List;

import ua.lviv.iot.Equipment.Equipment.Equipment;
import ua.lviv.iot.Equipment.Equipment.TypeOfEquipment;
import ua.lviv.iot.Equipment.Equipment.EnumProducer;

public interface EquipmentManager {

    List<Equipment> findByProducer(List<Equipment> devices, final EnumProducer producer);

    List<Equipment> findByHeight(List<Equipment> devices, final TypeOfEquipment height);

    List<Equipment> sortByPriceIncrease(List<Equipment> devices);

    List<Equipment> sortByPriceDecrease(List<Equipment> devices);

}
