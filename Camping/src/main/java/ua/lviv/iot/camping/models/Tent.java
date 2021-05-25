package ua.lviv.iot.camping.models;

import lombok.*;


import ua.lviv.iot.camping.enums.AppointmentType;

import javax.persistence.*;


@Entity
@Table(name = "tent_table")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true)
@NonNull
public class Tent extends CampingItem {
    private AppointmentType appointmentType;
    private Integer capacityOfPeople;
    private Integer squareTent;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    public Tent(Integer id, String name, String producer, Integer weightInGrams, Integer price,
                AppointmentType appointmentType, Integer capacityOfPeople, Integer squareTent) {
        super(name, producer, weightInGrams, price);
        this.id = id;
        this.appointmentType = appointmentType;
        this.capacityOfPeople = capacityOfPeople;
        this.squareTent = squareTent;

    }

}
