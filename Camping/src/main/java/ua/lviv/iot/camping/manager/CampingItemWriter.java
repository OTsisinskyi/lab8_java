package ua.lviv.iot.camping.manager;

import ua.lviv.iot.camping.models.CampingItem;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class CampingItemWriter {
    public void writeToFile(List<CampingItem> list, String path) {
        try {
            for (CampingItem campingItem : list) {
                FileWriter fileWriter = new FileWriter(path, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                printWriter.println(campingItem.getHeaders());
                printWriter.println(campingItem.toCSV());
                printWriter.println("\n");
                printWriter.flush();
                printWriter.close();
            }
            JOptionPane.showMessageDialog(null, "Record saved");
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Record not saved");
        }
    }
}

