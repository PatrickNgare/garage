package com.patrick.com.services.impl;

import com.patrick.com.db.model.Car;
import com.patrick.com.db.repo.CarRepo;
import com.patrick.com.dto.req.CarReq;
import com.patrick.com.dto.res.CarRes;
import com.patrick.com.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepo carRepo;

    @Override
    public CarRes createCar(CarReq carReq) {
        Car car = new Car();
        car.setColor(carReq.getColor());
        car.setOccupant(car.getOccupant());
        car.setPlate(car.getPlate());
        Car carSaved = carRepo.save(car);
        CarRes carRes = CarRes.builder().id(carSaved.getId()).build();
        if (carSaved != null) {
            carRes.setMessage("Success");
            return carRes;
        }
        carRes.setMessage("Failed");
        return carRes;
    }

    @Override
    public CarRes findCarById(Long id) {
        Optional<Car> optionalCar = carRepo.findById(id);
        if (optionalCar.isPresent()) {
            return CarRes.builder().id(optionalCar.get().getId()).message("Success").build();
        }
        return CarRes.builder().id(-1L).message("Failed").build();
    }
}
