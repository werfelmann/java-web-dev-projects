package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.launchcode.codingevents.data.EventData.remove;


@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", EventData.getAll());
        return "events/index";
    }

    // lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@ModelAttribute Event newEvent) {
        EventData.add(newEvent);
        return "redirect:/events"; //redirect to the root path
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventForm(@RequestParam(required=false) int[] eventIds) {
        if (eventIds == null) {
            return "redirect:/events";
        }
        for (int id : eventIds) {
            EventData:remove(id);
        }
        return "redirect:/events";
    }

    @GetMapping("edit/{eventId}")
    public String displayEditForm(Model model, @PathVariable int eventId) {
        Event eventToEdit = EventData.getById(eventId);
        model.addAttribute("event", "eventToEdit");
        String title = "Edit Event " + eventToEdit.getName() + "(id =" + eventToEdit.getId() + ")";
        model.addAttribute("title", title);
        return "event/edit";
    }

    @PostMapping("edit")
    public String processEditForm(int eventId, String name, String description) {
        return "redirect:/events";
    }
}
