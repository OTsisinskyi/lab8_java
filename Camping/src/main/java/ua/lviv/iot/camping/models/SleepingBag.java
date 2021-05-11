package ua.lviv.iot.camping.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.camping.enums.enumFiller;


@EqualsAndHashCode(callSuper = true)
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