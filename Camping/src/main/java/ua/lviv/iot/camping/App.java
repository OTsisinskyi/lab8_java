package ua.lviv.iot.camping;


import ua.lviv.iot.camping.enums.*;
import ua.lviv.iot.camping.manager.CampingManager;
import ua.lviv.iot.camping.models.*;


public class App {
    public static void main(String[] args) {
        CampingManager itemsManager = new CampingManager();
        itemsManager.addItems(new Tent("Tent", "Armot", 4100, 2100,
                enumAppointmentType.GROUP, 4, 5));
        itemsManager.addItems(new BackPack("Back pack", "Terra Incognita", 2265, 3499,
                enumViewType.FRAME, 40));
        itemsManager.addItems(new SleepingBag("Sleeping bag", "BUECHUA", 810, 1269,
                enumFiller.FLUFF));
        itemsManager.addItems(new FoodSet("Food set", "Food_tyt", 700, 850,
                enumAppointmentType.GROUP, 4000, 20));
        itemsManager.addItems(new FirstAidFit("First aid fit", "Help_tyt", 436, 670,
                enumAppointmentType.GROUP));
        itemsManager.addItems(new Raincoat("Raincoat", "Runok", 120, 230,
                enumRaincoatType.LONG, enumMaterialsType.SYNTHETIC));
        itemsManager.addItems(new ThermalClothing("Thermal clothing", "CUNISHER-STATIC", 150,
                500, enumMaterialThermalClothing.GORTEX));


        System.out.println("Sort by weight...");
        itemsManager.printCampingItems(itemsManager.sortByWeight(enumSortOrder.DESC));
        System.out.println("\n");


        System.out.println("Sort by producer...");
        itemsManager.printCampingItems(itemsManager.sortByProducer(enumSortOrder.ASC));
        System.out.println("\n");


        System.out.println("Find item...");
        System.out.println(itemsManager.findItem("Tent"));

    }
}