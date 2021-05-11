package ua.lviv.iot.camping.models;

import lombok.NoArgsConstructor;
import ua.lviv.iot.camping.enums.enumAppointmentType;


import lombok.Data;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Tent extends CampingItem {
    private enumAppointmentType appointmentType;
    private Integer capacityOfPeople;
    private Integer squareTent;

    public Tent(String name, String producer, Integer weightInGrams, Integer price, enumAppointmentType appointmentType,
                 Integer capacityOfPeople, Integer squareTent){
        super(name, producer, weightInGrams, price);
        this.appointmentType=appointmentType;
        this.capacityOfPeople=capacityOfPeople;
        this.squareTent=squareTent;
    }

}
