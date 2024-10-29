package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.util.Date;
import java.util.Objects;


@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    @Size(min=3, max=50, message="Name must be between 3 and 50 characters.")
    private String name;

    @Size(max=500, message="Description too long.")
    private String description;

    @Email(message = "Please enter a valid email address.")
    private String contactEmail;

    @NotBlank (message="Location may not be left blank.")
    private String location;

    @AssertTrue(message="Must confirm registration.")
    private Boolean registrationRequired;

    @Positive(message="Number of attendees must be greater than 0.")
    private int numberOfAttendees;

    private EventType type;

    public Event(String name, String description, String contactEmail, String location, Boolean registrationRequired, int numberOfAttendees, EventType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registrationRequired = registrationRequired;
        this.numberOfAttendees = numberOfAttendees;
        this.type = type;
    }

    public Event() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }


    public String getDescription() {
        return description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Event Name: " + name +
                "\nDescription: " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return getId() == event.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
