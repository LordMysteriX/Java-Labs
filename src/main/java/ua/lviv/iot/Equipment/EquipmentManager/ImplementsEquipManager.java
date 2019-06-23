package ua.lviv.iot.Equipment.EquipmentManager;

import ua.lviv.iot.Equipment.Equipment.EnumProducer;
import ua.lviv.iot.Equipment.Equipment.Equipment;
import ua.lviv.iot.Equipment.Equipment.TypeOfEquipment;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class ImplementsEquipManager implements EquipmentManager, Serializable {


    @Override
    public List<Equipment> findByProducer(List<Equipment> devices, EnumProducer producer) {
        return devices.stream().filter(device -> device.getProducer()
                .equals(producer)).collect(Collectors.toList());
    }


    @Override
    public List<Equipment> findByHeight(List<Equipment> devices, TypeOfEquipment height) {
        return devices.stream().filter(device -> device.getHeight()
                .equals(height)).collect(Collectors.toList());
    }

    @Override
    public List<Equipment> sortByPriceIncrease(List<Equipment> devices) {
        Collections.sort(devices, Comparator
                .comparing(Equipment::getPrice));
        return devices;
    }

    @Override
    public List<Equipment> sortByPriceDecrease(List<Equipment> devices) {
        Collections.sort(devices, Comparator
                .comparing(Equipment::getPrice).reversed());
        return devices;
    }
}

