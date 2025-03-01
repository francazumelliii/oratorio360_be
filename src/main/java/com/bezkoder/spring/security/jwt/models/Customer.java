package com.bezkoder.spring.security.jwt.models;

import com.bezkoder.spring.security.jwt.models.abstracts.AbstractModel;
import com.bezkoder.spring.security.jwt.models.embedded.EventCustomers;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Customer extends AbstractModel {
    @Column(nullable = false)
    private String name;

    @Column(nullable= false)
    private String surname;

    @Column(name="phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "customer")
    private Set<EventCustomers> events;
}
