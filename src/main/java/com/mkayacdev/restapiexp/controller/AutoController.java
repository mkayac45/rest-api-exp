package com.mkayacdev.restapiexp.controller;

import com.mkayacdev.restapiexp.model.Auto;
import com.mkayacdev.restapiexp.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class AutoController {

    @Autowired
    private AutoService autoService;

    @GetMapping("/cars")
    public ResponseEntity<List<Auto>> getAllAutos() { return autoService.getAllAutos();}

    //auto rest api
    @PostMapping("/cars")
    public ResponseEntity<Auto> createAuto(@RequestBody Auto auto){
        return autoService.createAuto(auto);
    }

    //id auto rest api
    @GetMapping("/cars/{id}")
    public ResponseEntity<Auto> getAutoId(@PathVariable Long id){
        return autoService.getAutoId(id);
    }

    // update auto rest api
    @PutMapping("/cars/{id}")
    public ResponseEntity<Auto> updateAuto(@PathVariable Long id,@RequestBody Auto autoUpdt){

        return autoService.updateAuto(autoUpdt);

    }

    //delete auto rest api
    @DeleteMapping("/cars//{id}")
    public ResponseEntity<Map<String,Boolean>> deleteAuto(@PathVariable Long id){
        return autoService.deleteAuto(id);
    }




















}
