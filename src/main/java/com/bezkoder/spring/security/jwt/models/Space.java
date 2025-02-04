package com.bezkoder.spring.security.jwt.models;


import com.bezkoder.spring.security.jwt.models.abstracts.AbstractModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Space extends AbstractModel {
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

    @Column(name="banner_img")
    private String bannerImg;

    @JoinColumn(name="created_by")
    @ManyToOne
    private User createdBy;


}
