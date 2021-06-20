package ua.lviv.iot.camping.models;


import lombok.EqualsAndHashCode;
import ua.lviv.iot.camping.enums.TypeOfBackpack;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class BackPack extends CampingItem {
    private TypeOfBackpack viewType;
    private int internalVolume;

    public BackPack(String name, String producer, Integer weightInGrams, Integer price,
                    TypeOfBackpack viewType, int internalVolume) {
        super(name, producer, weightInGrams, price);
        this.viewType = viewType;
        this.internalVolume = internalVolume;
    }

    public String getHeaders() {
        return super.getHeaders() + "viewType, " + "internalVolume";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getViewType() + ", " + getInternalVolume();
    }
}