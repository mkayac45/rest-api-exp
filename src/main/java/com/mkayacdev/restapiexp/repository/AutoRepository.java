package com.mkayacdev.restapiexp.repository;

import com.mkayacdev.restapiexp.model.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoRepository extends JpaRepository<Auto,Long> {


}
