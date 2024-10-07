package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static HashMap<String, String> eventList = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        eventList.put("Code and Coffee", "A hangout session for coding practice");
        eventList.put("Hackathon", "Code all night long");
        eventList.put("LaunchCode Meet and Greet", "Meet your local LaunchCoders");
        model.addAttribute("events", eventList);
        return "events/index";
    }

    // lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, @RequestParam String eventDescription) {
        eventList.put(eventName, eventDescription);
        return "redirect:/events"; //redirect to the root path
    }
}
