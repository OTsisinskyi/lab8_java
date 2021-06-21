package ua.lviv.iot.camping;

import net.sf.saxon.trans.SymbolicName;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import ua.lviv.iot.camping.enums.*;
import ua.lviv.iot.camping.manager.CampingItemWriter;
import ua.lviv.iot.camping.models.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WriterTest {

    @Test
    public void testWriteToFile(){
        List<CampingItem> campingItems = new ArrayList<>();
        campingItems.add(new Tent(1, "Tent", "Armot", 4100, 2100,
                AppointmentType.GROUP, 4, 5) );
        campingItems.add(new BackPack("Back pack", "Terra Incognita", 2265, 3499,
                TypeOfBackpack.FRAME, 40));
        campingItems.add(new SleepingBag("Sleeping bag", "BUECHUA", 810, 1269,
                Filler.FLUFF));
        campingItems.add(new FoodSet("Food set", "Food_tyt", 700, 850,
                AppointmentType.GROUP, 4000, 20));
        campingItems.add(new FirstAidFit("First aid fit", "Help_tyt", 436, 670,
                AppointmentType.GROUP));
        campingItems.add(new Raincoat("Raincoat", "Runok", 120, 230,
                RaincoatType.LONG, MaterialsType.SYNTHETIC));
        campingItems.add(new ThermalClothing("Thermal clothing", "CUNISHER-STATIC", 150,
                500, MaterialThermalClothing.GORTEX));
        CampingItemWriter campingItemWriter = new CampingItemWriter();
        campingItemWriter.writeToFile(campingItems,"src\\test\\resources\\testResult.csv");
        File result = new File("src\\test\\resources\\testResult.csv");
        File expected = new File("src\\test\\resources\\testExpected.csv");
        try {
            assertEquals(true, FileUtils.contentEquals(expected, result));
            result.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
