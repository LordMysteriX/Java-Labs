package test.java.ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.*;

import ua.lviv.iot.Equipment.Equipment.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import main.java.ua.lviv.iot.Equipment.EquipmentManager.ImplementsEquipManager;

import java.util.ArrayList;
import java.util.List;

public class TestManager {

    private ImplementsEquipManager EquipManager;
    private List<Equipment> devices;


    @BeforeEach
    void setUp() {
        EquipManager = new ImplementsEquipManager();
        devices = new ArrayList<Equipment>();
        devices.add(new Areometer(40, TypeOfEquipment.LOW, EnumProducer.TOSHIBA, 10));
        devices.add(new Balance(70, TypeOfEquipment.HIGH, EnumProducer.CASECOM, 25));
        devices.add(new Calorimeter(90, TypeOfEquipment.LOW, EnumProducer.GORENIYA, 11));
        devices.add(new Pycnometer(35, TypeOfEquipment.AVERAGE, EnumProducer.VASYA_CORPORATION, 15));
        devices.add(new Thermometer(120, TypeOfEquipment.AVERAGE, EnumProducer.VERES_INDUSTRIES, 20));
        devices.add(new Viscometer(150, TypeOfEquipment.LOW, EnumProducer.PHILIPS, 7));

    }


    @Test
    void testFindByProducer() {
        Assertions.assertEquals(1, EquipManager
                .findByProducer(devices, EnumProducer.TOSHIBA).size());
        Assertions.assertEquals(1, EquipManager
                .findByProducer(devices, EnumProducer.CASECOM).size());
        Assertions.assertEquals(1, EquipManager
                .findByProducer(devices, EnumProducer.PHILIPS).size());

    }

    @Test
    void testFindByHeight() {
        Assertions.assertEquals(3, EquipManager
                .findByHeight(devices, TypeOfEquipment.LOW).size());
        Assertions.assertEquals(2, EquipManager
                .findByHeight(devices, TypeOfEquipment.AVERAGE).size());
        Assertions.assertEquals(1, EquipManager
                .findByHeight(devices, TypeOfEquipment.HIGH).size());
    }

    @Test
    void testSortByPriceIncrease() {
        List<Equipment> results;
        results = EquipManager.sortByPriceIncrease(devices);
        Assertions.assertEquals(40, results.get(1).getPrice());
        Assertions.assertEquals(70, results.get(2).getPrice());
        Assertions.assertEquals(90, results.get(3).getPrice());
        Assertions.assertEquals(35, results.get(0).getPrice());
        Assertions.assertEquals(120, results.get(4).getPrice());
        Assertions.assertEquals(150, results.get(5).getPrice());

    }

    @Test
    void testSortByPriceDecrease() {
        List<Equipment> results;
        results = EquipManager.sortByPriceDecrease(devices);
        Assertions.assertEquals(40, results.get(4).getPrice());
        Assertions.assertEquals(70, results.get(3).getPrice());
        Assertions.assertEquals(90, results.get(2).getPrice());
        Assertions.assertEquals(35, results.get(5).getPrice());
        Assertions.assertEquals(120, results.get(1).getPrice());
        Assertions.assertEquals(150, results.get(0).getPrice());

    }
}

