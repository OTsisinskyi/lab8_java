package ua.lviv.iot.camping.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.camping.enums.AppointmentType;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class FoodSet extends CampingItem {
    private AppointmentType appointmentType;
    private Integer caloricContent;
    private Integer expirationData;

    public FoodSet(String name, String producer, Integer weightInGrams, Integer price,
                   AppointmentType appointmentType, Integer caloricContent, Integer expirationData) {
        super(name, producer, weightInGrams, price);
        this.appointmentType = appointmentType;
        this.caloricContent = caloricContent;
        this.expirationData = expirationData;
    }

    public String getHeaders() {
        return super.getHeaders() + "appointmentType, " + "caloricContent, " + "expirationData";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getAppointmentType() + ", " + getCaloricContent() + ", " + getExpirationData();
    }
}







