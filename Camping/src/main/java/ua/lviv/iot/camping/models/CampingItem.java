package ua.lviv.iot.camping.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
public abstract class CampingItem {
    private String name;
    private String producer;
    private Integer weightInGrams;
    private Integer price;

    public CampingItem(String name, String producer, Integer weightInGrams, Integer price) {
        this.name = name;
        this.producer = producer;
        this.weightInGrams = weightInGrams;
        this.price = price;
    }
}
