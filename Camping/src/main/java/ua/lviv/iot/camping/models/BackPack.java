package ua.lviv.iot.camping.models;


import ua.lviv.iot.camping.enums.enumViewType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class BackPack extends CampingItem {
    private enumViewType viewType;
    private int internalVolume;

    public BackPack(String name, String producer, Integer weightInGrams, Integer price,
                    enumViewType viewType, int internalVolume) {
        super(name, producer, weightInGrams, price);
        this.viewType = viewType;
        this.internalVolume = internalVolume;
    }
}