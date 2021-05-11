package ua.lviv.iot.camping.models;

import ua.lviv.iot.camping.enums.enumAppointmentType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class FoodSet extends CampingItem {
    private enumAppointmentType appointmentType;
    private Integer caloricContent;
    private Integer expirationData;

    public FoodSet(String name, String producer, Integer weightInGrams, Integer price,
                   enumAppointmentType appointmentType, Integer caloricContent, Integer expirationData) {
        super(name, producer, weightInGrams, price);
        this.appointmentType = appointmentType;
        this.caloricContent = caloricContent;
        this.expirationData = expirationData;
    }
}







