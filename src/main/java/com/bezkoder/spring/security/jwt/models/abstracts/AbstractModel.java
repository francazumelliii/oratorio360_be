package com.bezkoder.spring.security.jwt.models.abstracts;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
public abstract class AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name="created_at", nullable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name="updated_at", nullable = false)
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Column(name="deleted_at")
    private Timestamp deletedAt;


}
