package com.patrick.com.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarReq {

    @JsonProperty("number_plate")
    private String plate;
    @JsonProperty("color")
    private String color;
    @JsonProperty("occupant")
    private Long occupant;

}
