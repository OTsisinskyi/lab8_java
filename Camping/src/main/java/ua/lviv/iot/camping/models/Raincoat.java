package ua.lviv.iot.camping.models;

import lombok.EqualsAndHashCode;
import ua.lviv.iot.camping.enums.enumMaterialsType;
import ua.lviv.iot.camping.enums.enumRaincoatType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Raincoat extends CampingItem {
    private enumRaincoatType raincoatType;
    private enumMaterialsType materialsType;

    public Raincoat(String name, String producer, Integer weightInGrams, Integer price,
                    enumRaincoatType raincoatType, enumMaterialsType materialsType) {
        super(name, producer, weightInGrams, price);
        this.raincoatType = raincoatType;
        this.materialsType = materialsType;
    }
}
