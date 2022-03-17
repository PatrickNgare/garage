package com.patrick.com.dto.res;

import com.patrick.com.db.model.Car;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarRes {
    private Long id;
    private String message;

    public static CarRes getCarRes(Car car,String message){
        return CarRes.builder().id(car.getId()).message(message).build();
    }
}
