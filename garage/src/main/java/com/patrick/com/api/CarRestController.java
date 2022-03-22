package com.patrick.com.api;

import com.patrick.com.db.model.Car;
import com.patrick.com.dto.req.CarReq;
import com.patrick.com.dto.res.CarRes;
import com.patrick.com.services.CarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/car/v1")
@RequiredArgsConstructor
public class CarRestController {

    private final CarService carService;

    //Create Car
    @Operation(summary = "Get a car by its id")


    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Found the book", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Car.class))}), @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content), @ApiResponse(responseCode = "404", description = "Book not found", content = @Content)})
    @GetMapping("{id}")
    public ResponseEntity<CarRes> car(@PathVariable("id") Long id) {
        return ResponseEntity.ok(carService.findCarById(id));
    }

    @PostMapping
    public ResponseEntity<CarRes> car(@RequestBody CarReq carReq) {
        return ResponseEntity.ok(carService.createCar(carReq));
    }

}
