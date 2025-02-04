package com.bezkoder.spring.security.jwt.models;


import com.bezkoder.spring.security.jwt.models.abstracts.AbstractModel;
import com.bezkoder.spring.security.jwt.models.embedded.EventCustomers;
import com.bezkoder.spring.security.jwt.models.embedded.EventParticipants;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Event extends AbstractModel {

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column
    private String notes;

    @Column(name="start_datetime")
    private LocalDateTime startDateTime;

    @Column(name="end_datetime")
    private LocalDateTime endDateTime;

    @Column(name="organizer_number")
    private String organizerNumber;

    @Column(name="banner_img")
    private String bannerImg;

    @ManyToOne
    @JoinColumn(name="space_id")
    private Space space;

    @JoinColumn(name="created_by")
    @ManyToOne
    private User createdBy;

    @OneToMany(mappedBy = "event")
    private Set<EventParticipants> participants;

    @OneToMany(mappedBy = "event")
    private Set<EventCustomers> customers;



}
