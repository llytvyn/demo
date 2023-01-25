package com.myphotos.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/") // questo metodo corrisponde a questo path
   // @ResponseBody // tutto il contenuto sarà mostrato all'utente
    public String index(){
        return "index";
    }

    @RequestMapping("/second")
    @ResponseBody
    public String secondPage() {
        return "This is a second page!";
    }
}
