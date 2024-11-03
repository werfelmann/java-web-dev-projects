package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;


@Entity
public class Event extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long.")
    private String description;

    @Email(message = "Please enter a valid email address.")
    private String contactEmail;

    @NotBlank(message = "Location may not be left blank.")
    private String location;

    @AssertTrue(message = "Must confirm registration.")
    private Boolean registrationRequired;

    @Positive(message = "Number of attendees must be greater than 0.")
    private int numberOfAttendees;

    @ManyToOne
    @NotNull(message = "Category is required.")
    private EventCategory eventCategory;

    public Event(String name, String description, String contactEmail, String location, Boolean registrationRequired, int numberOfAttendees, EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registrationRequired = registrationRequired;
        this.numberOfAttendees = numberOfAttendees;
        this.eventCategory = new EventCategory();
    }

    public Event() {
    }

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

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return "Event Name: " + name +
                "\nDescription: " + description;
    }
}

