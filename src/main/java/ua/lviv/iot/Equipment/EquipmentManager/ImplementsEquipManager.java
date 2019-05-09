package main.java.ua.lviv.iot.Equipment.EquipmentManager;

import main.java.ua.lviv.iot.Equipment.Equipment.EnumProducer;
import main.java.ua.lviv.iot.Equipment.Equipment.Equipment;
import main.java.ua.lviv.iot.Equipment.Equipment.TypeOfEquipment;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementsEquipManager implements EquipmentManager, Serializable {

    private List<Equipment> devices;

    public ImplementsEquipManager() {

    }

    public ImplementsEquipManager(List<Equipment> devices) {
        this.devices = devices;
    }


    public List<Equipment> findByProducer(EnumProducer producer) {
        List<Equipment> foundList;
        foundList = this.devices.stream().filter(x -> producer.equals(x.getProducer()))
                .collect(Collectors.toList());
        return foundList;
    }

    public List<Equipment> findByHeight(TypeOfEquipment height) {
        List<Equipment> foundList;
        foundList = this.devices.stream().filter(x -> height.equals(x.getHeight()))
                .collect(Collectors.toList());
        return foundList;
    }

    public List<Equipment> sortByPrice(boolean reversed) {
        if (reversed) {
            Collections.sort(devices, (o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
        } else {
            Collections.sort(devices, (o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
        }
        return devices;
    }

}
