package ua.lviv.iot.camping.models;

import lombok.EqualsAndHashCode;
import ua.lviv.iot.camping.enums.MaterialsType;
import ua.lviv.iot.camping.enums.RaincoatType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Raincoat extends CampingItem {
    private RaincoatType raincoatType;
    private MaterialsType materialsType;

    public Raincoat(String name, String producer, Integer weightInGrams, Integer price,
                    RaincoatType raincoatType, MaterialsType materialsType) {
        super(name, producer, weightInGrams, price);
        this.raincoatType = raincoatType;
        this.materialsType = materialsType;
    }
}
