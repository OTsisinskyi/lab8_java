package ua.lviv.iot.camping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.camping.models.Tent;
import ua.lviv.iot.camping.service.TentService;

import java.util.List;

//localhost:8080/tent

@RestController
@RequestMapping(path = "/tent")
public class CampingItemController {

    @Autowired
    private TentService tentService;

    @GetMapping(path = "/{id}")
    public Tent getTent(@PathVariable(name = "id")  Integer id ){
        return  tentService.getTent(id);
    }

    @GetMapping
    public List<Tent> getTents(){
        return  tentService.getTents();

    }

    @PutMapping
    public Tent createTent(@RequestBody Tent tent){
        return tentService.addTent(tent);
    }

    @PostMapping
    public ResponseEntity<Tent> updateTent(@RequestBody Tent tent){
        if(tentService.getTent(tent.getId()) != null) {
            return new ResponseEntity<>(tentService.updateTent(tent), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }























}
