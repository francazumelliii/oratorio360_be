package com.bezkoder.spring.security.jwt.models;


import com.bezkoder.spring.security.jwt.models.abstracts.AbstractModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Emergency extends AbstractModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String phone_number;

    @OneToMany(mappedBy = "emergency")
    private Set<User> users;
}
