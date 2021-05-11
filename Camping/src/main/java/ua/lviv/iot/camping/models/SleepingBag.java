package ua.lviv.iot.camping.models;

import ua.lviv.iot.camping.enums.enumFiller;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class SleepingBag extends CampingItem {
    private enumFiller filler;

    public SleepingBag(String name, String producer, Integer weightInGrams,
                       Integer price, enumFiller filler) {
        super(name, producer, weightInGrams, price);
        this.filler = filler;
    }
}