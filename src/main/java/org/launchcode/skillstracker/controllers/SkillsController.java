package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String programmingLanguages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list:</h2>" +
                "<ol>" +
                "   <li>Java</li>" +
                "   <li>JavaScript</li>" +
                "   <li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String languageForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'input' method = 'post'>" +
                "<label>Name" +
                "<br />" +
                "<input type = 'text' name = 'name'>" +
                "</label>" +
                "<br />" +
                "<label>My favorite language:" +
                "<br />" +
                "<select name='firstchoice' id='firstchoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label>" +
                "<br />" +
                "<label>My second favorite language:" +
                "<br />" +
                "<select name='secondchoice' id='secondchoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label>" +
                "<br />" +
                "<label>My third favorite language:" +
                "<br />" +
                "<select name='thirdchoice' id='thirdchoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label>" +
                "<br />" +
                "<input type = 'submit' value = 'Submit' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("input")
    public String formSubmit(@RequestParam String name, @RequestParam String firstchoice, @RequestParam String secondchoice, @RequestParam String thirdchoice) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "   <li>" + firstchoice +"</li>" +
                "   <li>" + secondchoice +"</li>" +
                "   <li>" + thirdchoice +"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }



}
