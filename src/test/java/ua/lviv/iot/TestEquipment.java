package test.java.ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.*;

import ua.lviv.iot.Equipment.Equipment.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestEquipment {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testAreometer() {
        Equipment areometer = new Areometer();

        areometer.setProducer(EnumProducer.TOSHIBA);
        areometer.setPrice(40);
        areometer.setLenght(10);
        areometer.setHeight(TypeOfEquipment.LOW);

        assertEquals(EnumProducer.TOSHIBA, areometer.getProducer());
        assertEquals(40, areometer.getPrice());
        assertEquals(10, areometer.getLenght());
        assertEquals(TypeOfEquipment.LOW, areometer.getHeight());

    }

    @Test
    void testBalance() {
        Equipment balance = new Balance();

        balance.setProducer(EnumProducer.CASECOM);
        balance.setPrice(70);
        balance.setLenght(25);
        balance.setHeight(TypeOfEquipment.HIGH);

        assertEquals(EnumProducer.CASECOM, balance.getProducer());
        assertEquals(70, balance.getPrice());
        assertEquals(25, balance.getLenght());
        assertEquals(TypeOfEquipment.HIGH, balance.getHeight());

    }

    @Test
    void testCalorimeter() {
        Equipment calorimeter = new Calorimeter();

        calorimeter.setProducer(EnumProducer.GORENIYA);
        calorimeter.setPrice(90);
        calorimeter.setLenght(11);
        calorimeter.setHeight(TypeOfEquipment.LOW);

        assertEquals(EnumProducer.GORENIYA, calorimeter.getProducer());
        assertEquals(90, calorimeter.getPrice());
        assertEquals(11, calorimeter.getLenght());
        assertEquals(TypeOfEquipment.LOW, calorimeter.getHeight());


    }

    @Test
    void testPycnometer() {
        Equipment pycnometer = new Pycnometer();

        pycnometer.setProducer(EnumProducer.VASYA_CORPORATION);
        pycnometer.setPrice(35);
        pycnometer.setLenght(15);
        pycnometer.setHeight(TypeOfEquipment.AVERAGE);

        assertEquals(EnumProducer.VASYA_CORPORATION, pycnometer.getProducer());
        assertEquals(35, pycnometer.getPrice());
        assertEquals(15, pycnometer.getLenght());
        assertEquals(TypeOfEquipment.AVERAGE, pycnometer.getHeight());

    }

    @Test
    void testThermometer() {
        Equipment thermometer = new Thermometer();

        thermometer.setProducer(EnumProducer.VERES_INDUSTRIES);
        thermometer.setPrice(120);
        thermometer.setLenght(20);
        thermometer.setHeight(TypeOfEquipment.AVERAGE);

        assertEquals(EnumProducer.VERES_INDUSTRIES, thermometer.getProducer());
        assertEquals(120, thermometer.getPrice());
        assertEquals(20, thermometer.getLenght());
        assertEquals(TypeOfEquipment.AVERAGE, thermometer.getHeight());

    }

    @Test
    void testViscometer() {
        Equipment viscometer = new Viscometer();

        viscometer.setProducer(EnumProducer.PHILIPS);
        viscometer.setPrice(150);
        viscometer.setLenght(7);
        viscometer.setHeight(TypeOfEquipment.LOW);

        assertEquals(EnumProducer.PHILIPS, viscometer.getProducer());
        assertEquals(150, viscometer.getPrice());
        assertEquals(7, viscometer.getLenght());
        assertEquals(TypeOfEquipment.LOW, viscometer.getHeight());

    }

}

