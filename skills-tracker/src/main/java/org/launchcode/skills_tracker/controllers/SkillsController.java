package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping("/")
    @ResponseBody
    public String displaySkills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol><li>Java</li><li>JavaScript</li><li>Python</li></ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String displayForm() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                //form
                "<form method='post' action='/form'>" +
                "<label>Name:</label></br>" +
                "<input type='text' name='name'></br>" +
                //favorite
                "<label>My favorite language:</label></br>" +
                "<select name='favLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                //second favorite
                "<label>My second favorite language:</label></br>" +
                "<select name='secondFavLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                //third favorite
                "<label>My third favorite language:</label></br>" +
                "<select name='thirdFavLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String onSubmit(@RequestParam String name, @RequestParam String favLang, @RequestParam String secondFavLang, @RequestParam String thirdFavLang) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favLang + "</li>" +
                "<li>" + secondFavLang + "</li>" +
                "<li>" + thirdFavLang + "</li>" +
                "</body>" +
                "</html>";
    }
}
