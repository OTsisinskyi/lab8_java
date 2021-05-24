package ua.lviv.iot.camping.models;


import lombok.EqualsAndHashCode;
import ua.lviv.iot.camping.enums.enumTypeOfBackpack;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class BackPack extends CampingItem {
    private enumTypeOfBackpack viewType;
    private int internalVolume;

    public BackPack(String name, String producer, Integer weightInGrams, Integer price,
                    enumTypeOfBackpack viewType, int internalVolume) {
        super(name, producer, weightInGrams, price);
        this.viewType = viewType;
        this.internalVolume = internalVolume;
    }
}