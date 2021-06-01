package com.sample.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavigationController {

    private Log log = LogFactory.getLog(this.getClass());


    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String startUpPage() {
        return "home";
    }


    @RequestMapping(value = "/home", method= RequestMethod.GET)
    public String homePage() {
        return "home";
    }


    @RequestMapping(value = "/students", method= RequestMethod.GET)
    public String stuPage() {
        return "students";
    }

    @RequestMapping(value = "/PutStudents", method= RequestMethod.GET)
    public String stuupPage() {
        return "PutStudents";
    }



}
