package com.bezkoder.spring.security.jwt.models.embedded.keys;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EventCustomersID implements Serializable {

    private Long customerId;
    private Long eventId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
}
