package ua.lviv.iot.Equipment.EquipmentManager;

import ua.lviv.iot.Equipment.Equipment.Equipment;

import java.io.*;
import java.util.List;

public class ManagerWriter {

     private String filePath;

     public ManagerWriter(){

     }

     public ManagerWriter(final String filePathObj){
         this.filePath = filePathObj;
     }

     public final void writeToFile(
             final List<Equipment> listOfEquipment) {
         File myFile = new File(filePath + ".csv");


         try (FileOutputStream fos = new FileOutputStream(myFile);
              OutputStreamWriter osw = new OutputStreamWriter(fos);
              BufferedWriter bufWtiter = new BufferedWriter(osw)) {


             for (Equipment device : listOfEquipment) {
                 bufWtiter.write((device.getHeaders()));
                 bufWtiter.newLine();
                 bufWtiter.write(device.toCSV());
                 bufWtiter.newLine();
             }

         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } finally {

         }

     }
    public final String getFilePath(){
        return filePath;
    }

    public final void setFilePath(final String FilePathObj){
        this.filePath = FilePathObj;
    }
}


