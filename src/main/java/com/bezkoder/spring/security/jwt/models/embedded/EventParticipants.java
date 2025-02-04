package com.bezkoder.spring.security.jwt.models.embedded;

import com.bezkoder.spring.security.jwt.models.Event;
import com.bezkoder.spring.security.jwt.models.User;
import com.bezkoder.spring.security.jwt.models.abstracts.AbstractModel;
import com.bezkoder.spring.security.jwt.models.abstracts.AbstractRelation;
import com.bezkoder.spring.security.jwt.models.embedded.keys.EventParticipantsID;
import jakarta.persistence.*;

@Table(name="event_participants")
@Entity
public class EventParticipants extends AbstractRelation  {

    @EmbeddedId
    private EventParticipantsID id;

    @ManyToOne
    @JoinColumn(name="user_id")
    @MapsId("userId")
    private User user;

    @ManyToOne
    @JoinColumn(name="event_id")
    @MapsId("eventId")
    private Event event;

    public EventParticipantsID getId() {
        return id;
    }

    public void setId(EventParticipantsID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
