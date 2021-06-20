package ua.lviv.iot.camping.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.camping.dal.TentRepository;
import ua.lviv.iot.camping.models.Tent;
import ua.lviv.iot.camping.myExсeptions.TentNotFoundException;

import java.util.List;


@Service
@ApplicationScope
public class TentService {

    private final TentRepository repository;

    public TentService(TentRepository repository) {
        this.repository = repository;
    }

    public Tent addTent(Tent tent) {
        return repository.save(tent);
    }

    public Tent updateTent(Tent tent) throws TentNotFoundException {
        if (repository.existsById(tent.getId())) {
            return repository.save(tent);
        }
        throw new TentNotFoundException("Tent with id: " + tent.getId() + "not found");
    }

    public List<Tent> getTents() {
        return repository.findAll();
    }

    public Tent getTent(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Tent deleteTent(Integer id) {
        Tent tent = repository.findById(id).orElseThrow();
        if (tent == null) {
            return null;
        }
        repository.deleteById(id);
        return tent;
    }
}
