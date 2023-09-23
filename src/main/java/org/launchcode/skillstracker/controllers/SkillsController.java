package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping(value = "")
    @ResponseBody
    public String startSkills(){
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>We have some skills to learn<h2>" +
                "<ol>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "<li>C++</li>" +
                "</ol>";

        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String formSkills(){
        String html ="<form method='post' action = '/form'>" +
                "<input type = 'text' name='userName'>Name</input>" +
                "<select name='moose'>"+
                "<option value= 'JavaScript'>Javascript</option>" +
                "<option value= 'Python'>Python</option>" +
                "<option value= 'C++'>C++</option>" +
                "</select>" +
                "<select name='secondMoose'>"+
                "<option value= 'JavaScript'>Javascript</option>" +
                "<option value= 'Python'>Python</option>" +
                "<option value= 'C++'>C++</option>"+
                "</select>" +
                "<select name='kwct5'>"+
                "<option value= 'JavaScript'>Javascript</option>" +
                "<option value= 'Python'>Python</option>" +
                "<option value= 'C++'>C++</option>" +
                "</select>" +
                "<input type='submit' value='Submit'/>" +
                "</form";

        return html;
    }

    @PostMapping(value="form")
    @ResponseBody
    public String namePage(@RequestParam String userName, String moose, String secondmoose, String kwct5){
        String html = "<h1>" + userName + "</h1>"+
                "<ol>"+
                "<li>"+ moose + "</li>" +
                "<li>"+ secondmoose + "</li>" +
                "<li>"+ kwct5 + "</li>" +
                "</ol>";

        return html;
    }


}
