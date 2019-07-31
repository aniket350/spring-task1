package com.stackroute.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller


public class AppController {
    @RequestMapping("/")

    public String message() {
        return "index";
    }

    @RequestMapping("/message")
    public ModelAndView passParametersWithModelAndView() {
        ModelAndView modelAndView = new ModelAndView("viewPage");
        modelAndView.addObject("message", "");
        return modelAndView;
    }
}
