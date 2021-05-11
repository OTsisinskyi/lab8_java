package ua.lviv.iot.camping.models;

import ua.lviv.iot.camping.enums.enumAppointmentType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class FirstAidFit extends CampingItem {
    private enumAppointmentType appointmentType;

    public FirstAidFit(String name, String producer, Integer weightInGrams,
                       Integer price, enumAppointmentType appointmentType) {
        super(name, producer, weightInGrams, price);
        this.appointmentType = appointmentType;
    }
}