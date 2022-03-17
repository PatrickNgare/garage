package com.patrick.com.db.repo;

import com.patrick.com.db.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepo  extends JpaRepository<Car, Long> {
    Optional<Car> findByColor(String color);
}
