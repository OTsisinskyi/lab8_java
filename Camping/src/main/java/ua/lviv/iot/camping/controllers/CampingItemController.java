package ua.lviv.iot.camping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.camping.models.Tent;
import ua.lviv.iot.camping.myExсeptions.TentNotFoundException;
import ua.lviv.iot.camping.service.TentService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

//localhost:8080/tent

@RestController
@RequestMapping(path = "/tent")
public class CampingItemController {

    private static final Logger LOGGER = Logger.getLogger("ua.lviv.iot.camping.controllers");


    @Autowired
    private final TentService tentService;

    public CampingItemController(final TentService tentService) {
        this.tentService = tentService;
    }

    @GetMapping
    public List<Tent> getTents() {
        return tentService.getTents();

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Tent> getTent(final @PathVariable(name = "id") Integer id) {
        try {
            return new ResponseEntity<>(tentService.getTent(id), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            LOGGER.severe("Can't update an tent with non-existing id" + id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping
    public ResponseEntity<Tent> createTent(@RequestBody Tent tent) {
        if (tent.getId() == null) {
            return new ResponseEntity<>(tentService.addTent(tent), HttpStatus.OK);
        }
        LOGGER.severe("Failed to create an tent with passed id. Tent creation should not use external ids.");
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping
    public ResponseEntity<Tent> updateTent(@RequestBody Tent tent) throws TentNotFoundException {
        if (tent.getId() == null) {
            LOGGER.severe("Can't update tent without id - null value was passed instead of it");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try {
            return new ResponseEntity<>(tentService.updateTent(tent), HttpStatus.OK);
        } catch (TentNotFoundException e) {
            LOGGER.severe("Can't update an tent with non-existing id " + tent.getId());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Tent> deleteTent(@PathVariable(name = "id") Integer id) {
       try {
           return new ResponseEntity<>(tentService.deleteTent(id), HttpStatus.OK);
       }catch (NoSuchElementException e){
           LOGGER.severe("Can't delete an tent with non-existing id" + id);
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }

    }
}

