package com.patrick.com.db.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car_table")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "number_plate")
    private String plate;
    private String color;
    @Column(name = "occupants")
    private Long occupant;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "engine_id", referencedColumnName = "id")
    private Engine engine;

}
