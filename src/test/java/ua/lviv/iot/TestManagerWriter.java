package ua.lviv.iot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Equipment.Equipment.*;
import ua.lviv.iot.Equipment.EquipmentManager.ManagerWriter;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestManagerWriter {

    private List<Equipment> listOfEquipment = new LinkedList<>();
    ManagerWriter writer = new ManagerWriter();
    private String filePath = "myFile";

    private Areometer areometer = new Areometer
            (40, TypeOfEquipment.LOW, EnumProducer.TOSHIBA, 10, 5);
    private Balance balance = new Balance
            (70, TypeOfEquipment.HIGH, EnumProducer.CASECOM, 25);
    private Calorimeter calorimeter = new Calorimeter
            (90, TypeOfEquipment.LOW, EnumProducer.GORENIYA, 11);
    private Pycnometer pycnometer = new Pycnometer
            (35, TypeOfEquipment.AVERAGE, EnumProducer.VASYA_CORPORATION, 15);
    private Thermometer thermometer = new Thermometer
            (120, TypeOfEquipment.AVERAGE, EnumProducer.VERES_INDUSTRIES, 20);
    private Viscometer viscometer = new Viscometer
            (150, TypeOfEquipment.LOW, EnumProducer.PHILIPS, 7);

    @BeforeEach
    void setUp() {
        listOfEquipment.add(areometer);
        listOfEquipment.add(balance);
        listOfEquipment.add(calorimeter);
        listOfEquipment.add(pycnometer);
        listOfEquipment.add(thermometer);
        listOfEquipment.add(viscometer);

        writer = new ManagerWriter(filePath);
    }

    @Test
    void writeToFile() {
        File myFile = new File(filePath + ".csv");
        writer.writeToFile(this.listOfEquipment);

        try (FileInputStream fis = new FileInputStream(myFile);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader reader = new BufferedReader(isr)) {

            for (Equipment device : listOfEquipment) {
                assertEquals(device.getHeaders(), reader.readLine());
                assertEquals(device.toCSV(), reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testGettesrAndSettersFilePath(){
        writer.setFilePath(filePath);
        assertEquals(filePath, writer.getFilePath(),
                "Getters or Setters method failed");
    }
}

