package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    @GetMapping("/events")
    public String events(Model model) {
        List<String> eventList = new ArrayList<>();
        eventList.add("concert");
        eventList.add("wedding");
        eventList.add("holiday");
        eventList.add("graduation");

        return "events/index";
    }
}
