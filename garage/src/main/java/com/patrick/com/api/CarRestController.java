package com.patrick.com.api;

import com.patrick.com.dto.req.CarReq;
import com.patrick.com.dto.res.CarRes;
import com.patrick.com.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/car/v1")
@RequiredArgsConstructor
public class CarRestController {

    private final CarService carService;
    //Create Car
    @GetMapping("{id}")
    public ResponseEntity<CarRes> car(@PathVariable("id")  Long id){
        return ResponseEntity.ok(carService.findCarById(id));
    }
    @PostMapping
    public ResponseEntity<CarRes> car(@RequestBody CarReq carReq) {
        return ResponseEntity.ok(carService.createCar(carReq));
    }

}
