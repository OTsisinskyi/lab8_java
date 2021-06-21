package ua.lviv.iot.camping.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.camping.enums.Filler;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class SleepingBag extends CampingItem {
    private Filler filler;

    public SleepingBag(String name, String producer, Integer weightInGrams,
                       Integer price, Filler filler) {
        super(name, producer, weightInGrams, price);
        this.filler = filler;
    }

    public String getHeaders() {
        return super.getHeaders() + "filler";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getFiller();
    }
}