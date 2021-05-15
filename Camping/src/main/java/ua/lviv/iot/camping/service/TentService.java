package ua.lviv.iot.camping.service;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.camping.models.Tent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Service
@ApplicationScope
public class TentService {

    private final AtomicInteger id = new AtomicInteger(0);
    private final Map<Integer, Tent> tentsMap = new HashMap<>();

    public Tent addTent(Tent tent) {
        Integer tentId = id.incrementAndGet();
        tent.setId(tentId);
        tentsMap.put(tentId, tent);
        return tent;
    }

    public Tent updateTent(Tent tent) {
        return tentsMap.put(tent.getId(), tent);
    }

    public List<Tent> getTents() {
        return new ArrayList<>(tentsMap.values());
    }

    public Tent getTent(Integer id) {
        return tentsMap.get(id);
    }

    public Tent deleteTent(Integer id) {
        return tentsMap.remove(id);
    }
}
