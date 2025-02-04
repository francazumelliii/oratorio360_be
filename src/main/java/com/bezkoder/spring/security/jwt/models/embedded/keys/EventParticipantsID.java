package com.bezkoder.spring.security.jwt.models.embedded.keys;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Id;

import java.io.Serializable;

@Embeddable
public class EventParticipantsID implements Serializable {
    private Long eventId;
    private Long userId;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
