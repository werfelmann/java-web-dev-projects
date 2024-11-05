package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.*;

@Entity
public class EventDetails extends AbstractEntity {

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

    public EventDetails(String description, String contactEmail, String location, Boolean registrationRequired, int numberOfAttendees) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registrationRequired = registrationRequired;
        this.numberOfAttendees = numberOfAttendees;
    }

    public EventDetails() {};

    public @Size(max = 500, message = "Description too long.") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500, message = "Description too long.") String description) {
        this.description = description;
    }

    public @Email(message = "Please enter a valid email address.") String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email(message = "Please enter a valid email address.") String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public @NotBlank(message = "Location may not be left blank.") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "Location may not be left blank.") String location) {
        this.location = location;
    }

    public @AssertTrue(message = "Must confirm registration.") Boolean getRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(@AssertTrue(message = "Must confirm registration.") Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    @Positive(message = "Number of attendees must be greater than 0.")
    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(@Positive(message = "Number of attendees must be greater than 0.") int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }
}
