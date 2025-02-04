package com.bezkoder.spring.security.jwt.models.embedded;


import com.bezkoder.spring.security.jwt.models.Customer;
import com.bezkoder.spring.security.jwt.models.Event;
import com.bezkoder.spring.security.jwt.models.abstracts.AbstractRelation;
import com.bezkoder.spring.security.jwt.models.embedded.keys.EventCustomersID;
import jakarta.persistence.*;

@Entity
@Table(name="event_customers")
public class EventCustomers  extends AbstractRelation {

    @EmbeddedId
    private EventCustomersID id;

    @JoinColumn(name="event_id")
    @ManyToOne
    @MapsId("eventId")
    private Event event;

    @JoinColumn(name="customer_id")
    @ManyToOne
    @MapsId("customerId")
    private Customer customer;

    public EventCustomersID getId() {
        return id;
    }

    public void setId(EventCustomersID id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
