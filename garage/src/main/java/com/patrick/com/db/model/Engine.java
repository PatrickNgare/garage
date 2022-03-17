package com.patrick.com.db.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long cc;
    private  String type;
    private  String model;

    @OneToOne(mappedBy = "engine")
    private Car car;
}
