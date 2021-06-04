package com.mkayacdev.restapiexp.service;

import com.mkayacdev.restapiexp.model.Auto;
import org.springframework.http.ResponseEntity;


public interface AutoService {
    ResponseEntity getAllAutos();
    ResponseEntity createAuto(Auto auto);
    ResponseEntity getAutoId(Long id);
    ResponseEntity updateAuto(Auto AutoUpdt);
    ResponseEntity deleteAuto(Long id);

}
