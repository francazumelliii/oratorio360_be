package com.bezkoder.spring.security.jwt.models.abstracts;

import com.bezkoder.spring.security.jwt.models.User;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;


public abstract class AbstractRelation {

    @Column(name="created_at", nullable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name="updated_at", nullable = false)
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Column(name="deleted_at")
    private Timestamp deletedAt;

    @JoinColumn(name="created_by")
    private User createdBy;


}
