package com.patrick.com.services;

import com.patrick.com.dto.req.CarReq;
import com.patrick.com.dto.res.CarRes;

public interface CarService {
    CarRes createCar(CarReq carReq);

    CarRes findCarById(Long id);
}
