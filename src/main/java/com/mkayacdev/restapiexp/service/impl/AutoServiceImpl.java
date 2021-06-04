package com.mkayacdev.restapiexp.service.impl;

import com.mkayacdev.restapiexp.exception.ResourceNotFoundException;
import com.mkayacdev.restapiexp.model.Auto;
import com.mkayacdev.restapiexp.repository.AutoRepository;
import com.mkayacdev.restapiexp.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AutoServiceImpl implements AutoService {

    @Autowired
    private AutoRepository autoRepository;

    @Override
    public ResponseEntity getAllAutos() {
        return ResponseEntity.ok(autoRepository.findAll());
    }

    @Override
    public ResponseEntity createAuto(Auto auto) {
        return ResponseEntity.ok(autoRepository.save(auto));
    }

    @Override
    public ResponseEntity getAutoId(Long id) {
        Auto auto = autoRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Auto not exist with id:"+id));
        return ResponseEntity.ok(auto);
    }

    @Override
    public ResponseEntity updateAuto(Auto autoUpdt) {
        Auto auto = autoRepository.findById(autoUpdt.getId()).orElseThrow(() -> new ResourceNotFoundException(("Auto not exist with id :"+ autoUpdt.getId())));

        auto.setHorsePower(autoUpdt.getHorsePower());
        auto.setMileAge(autoUpdt.getMileAge());
        auto.setModel(autoUpdt.getModel());
        auto.setTradeMark(autoUpdt.getTradeMark());
        auto.setTransmission(autoUpdt.getTransmission());

        Auto updatedAuto = autoRepository.save(auto);
        return ResponseEntity.ok(updatedAuto);

    }

    @Override
    public ResponseEntity deleteAuto(Long id) {
        Auto auto = autoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(("Auto not exist with id :"+ id)));

        autoRepository.delete(auto);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
