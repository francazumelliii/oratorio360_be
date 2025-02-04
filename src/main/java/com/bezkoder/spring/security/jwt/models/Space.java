package com.bezkoder.spring.security.jwt.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Space extends AbstractModel{
    @Column(nullable = false)
    private String name;

    @Column()
    private Float latitude;

    @Column
    private Float longitude;

    @Column
    private String address;

    @Column
    private String description;

    @Column
    private String notes;

    @Column(name="max_users")
    private Integer maxUsers;

    // TODO add createdBy
}
