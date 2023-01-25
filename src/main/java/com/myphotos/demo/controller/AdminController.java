package com.myphotos.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminController {

    @RequestMapping("/admin") // questo metodo corrisponde a questo path
        public String index(){
        return "admin";
    }
}
