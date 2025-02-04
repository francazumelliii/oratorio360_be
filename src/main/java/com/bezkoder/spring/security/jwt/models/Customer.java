package com.bezkoder.spring.security.jwt.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Customer extends AbstractModel{
    @Column(nullable = false)
    private String name;

    @Column(nullable= false)
    private String surname;

    @Column(name="phone_number")
    private String phoneNumber;

}
