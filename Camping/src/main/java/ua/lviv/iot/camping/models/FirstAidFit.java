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
public class FirstAidFit extends CampingItem  {
    private enumAppointmentType appointmentType;

    public FirstAidFit(String name, String producer, Integer weightInGrams,
                       Integer price, enumAppointmentType appointmentType) {
        super(name, producer, weightInGrams, price);
        this.appointmentType = appointmentType;
    }
}