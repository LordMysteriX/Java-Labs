package main.java.ua.lviv.iot.Equipment;

import main.java.ua.lviv.iot.Equipment.Equipment.*;
import main.java.ua.lviv.iot.Equipment.Equipment.Equipment;
import main.java.ua.lviv.iot.Equipment.EquipmentManager.EquipmentManager;
import main.java.ua.lviv.iot.Equipment.EquipmentManager.ImplementsEquipManager;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Equipment areometer = new Areometer();
        Equipment balance = new Balance();
        Equipment calorimeter = new Calorimeter();
        Equipment pycnometer = new Pycnometer();
        Equipment thermometer = new Thermometer();
        Equipment viscometer = new Viscometer();

        areometer.setProducer(EnumProducer.TOSHIBA);
        balance.setProducer(EnumProducer.CASECOM);
        calorimeter.setProducer(EnumProducer.GORENIYA);
        pycnometer.setProducer(EnumProducer.VASYA_CORPORATION);
        thermometer.setProducer(EnumProducer.VERES_INDUSTRIES);
        viscometer.setProducer(EnumProducer.PHILIPS);

        areometer.setPrice(40);
        balance.setPrice(70);
        calorimeter.setPrice(90);
        pycnometer.setPrice(35);
        thermometer.setPrice(120);
        viscometer.setPrice(150);

        areometer.setLenght(10);
        balance.setLenght(25);
        calorimeter.setLenght(11);
        pycnometer.setLenght(15);
        thermometer.setLenght(20);
        viscometer.setLenght(7);

        areometer.setHeight(TypeOfEquipment.LOW);
        balance.setHeight(TypeOfEquipment.HIGH);
        calorimeter.setHeight(TypeOfEquipment.LOW);
        pycnometer.setHeight(TypeOfEquipment.AVERAGE);
        thermometer.setHeight(TypeOfEquipment.AVERAGE);
        viscometer.setHeight(TypeOfEquipment.LOW);

        List<Equipment> devices = new ArrayList<>();
        devices.add(areometer);
        devices.add(balance);
        devices.add(calorimeter);
        devices.add(pycnometer);
        devices.add(thermometer);
        devices.add(viscometer);

        EquipmentManager manager = new ImplementsEquipManager(devices);

        List<Equipment> findProducer = manager.findByProducer(EnumProducer.TOSHIBA);
        findProducer.forEach((Equipment device) -> {
            System.out.println(device.getProducer());
        });

        System.out.println();

        List<Equipment> findHeight = manager.findByHeight(TypeOfEquipment.LOW);
        findHeight.forEach((Equipment device) -> {
            System.out.println(device.getPrice());
        });

        System.out.println();

        List<Equipment> sortPrice = manager.sortByPrice(false);
        sortPrice.forEach((Equipment device) -> {
            System.out.println(device.getPrice());
        });
    }

}
