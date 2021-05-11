package ua.lviv.iot.camping.models;

import ua.lviv.iot.camping.enums.enumMaterialThermalClothing;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class ThermalClothing extends CampingItem {
    private enumMaterialThermalClothing materialThermalClothing;

    public ThermalClothing(String name, String producer, Integer weightInGrams, Integer price,
                           enumMaterialThermalClothing materialThermalClothing) {
        super(name, producer, weightInGrams, price);
        this.materialThermalClothing = materialThermalClothing;
    }
}