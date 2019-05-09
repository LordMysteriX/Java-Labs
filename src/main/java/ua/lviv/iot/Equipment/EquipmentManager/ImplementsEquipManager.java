package ua.lviv.iot.Equipment.EquipmentManager;

import ua.lviv.iot.Equipment.Equipment.EnumProducer;
import ua.lviv.iot.Equipment.Equipment.Equipment;
import ua.lviv.iot.Equipment.Equipment.TypeOfEquipment;
import ua.lviv.iot.Equipment.EquipmentManager.EquipmentManager;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementsEquipManager implements EquipmentManager, Serializable {

    private List<Equipment> devices;

    public ImplementsEquipManager() {

    }

    public ImplementsEquipManager(final List<Equipment>  devices) {
        this.devices = devices;
    }


    public final List<Equipment> findByProducer(final EnumProducer producer) {
        List<Equipment> foundList;
        foundList = this.devices.stream().filter(x ->
                producer.equals(x.getProducer()))
                .collect(Collectors.toList());
        return foundList;
    }

    public final List<Equipment> findByHeight(final TypeOfEquipment height) {
        List<Equipment> foundList;
        foundList = this.devices.stream().filter(x ->
                height.equals(x.getHeight()))
                .collect(Collectors.toList());
        return foundList;
    }

    public final List<Equipment> sortByPrice(final boolean reversed) {
        if (reversed) {
            Collections.sort(devices, (o1, o2) ->
                    (int) (o1.getPrice() - o2.getPrice()));
        } else {
            Collections.sort(devices, (o1, o2) ->
                    (int) (o2.getPrice() - o1.getPrice()));
        }
        return devices;
    }

}
