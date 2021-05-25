package ua.lviv.iot.camping.manager;


import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.camping.enums.SortOrder;
import ua.lviv.iot.camping.models.CampingItem;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class CampingManager {
    private List<CampingItem> items = new ArrayList<>();

    public void addItems(CampingItem item) {
        this.items.add(item);
    }


    public List<CampingItem> findItem(String name) {
        return items.stream().filter(i -> i.getName().equals(name)).collect(Collectors.toList());

    }

    public List<CampingItem> sortByWeight(SortOrder order) {
        if (order == SortOrder.ASC) {
            items.sort(Comparator.comparing(CampingItem::getWeightInGrams));
        } else {
            items.sort(Comparator.comparing(CampingItem::getWeightInGrams).reversed());
        }
        return items;
    }

    public List<CampingItem> sortByProducer(SortOrder order) {
        if (order == SortOrder.ASC) {
            items.sort(Comparator.comparing(CampingItem::getProducer));
        } else {
            items.sort(Comparator.comparing(CampingItem::getProducer).reversed());
        }
        return items;
    }

    public void printCampingItems(List<CampingItem> items) {
        items.forEach(System.out::println);
    }
}

