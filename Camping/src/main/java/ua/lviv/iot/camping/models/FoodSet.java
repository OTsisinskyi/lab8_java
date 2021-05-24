package ua.lviv.iot.camping.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.camping.enums.enumAppointmentType;


@EqualsAndHashCode(callSuper = true)
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







