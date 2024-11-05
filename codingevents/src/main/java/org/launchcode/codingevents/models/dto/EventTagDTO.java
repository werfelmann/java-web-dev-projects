package org.launchcode.codingevents.models.dto;

import jakarta.validation.constraints.NotNull;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.Tag;

public class EventTagDTO {

    @NotNull
    private Event events;

    @NotNull
    private Tag tag;

    public EventTagDTO() {}

    public Event getEvent() {
        return events;
    }

    public void setEvent(Event events) {
        this.events = events;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
