package com.sn.edacy.appwebedacy;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloEdacy {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        System.out.println(" Hello ");
        return "Hello";
    }


    @RequestMapping("/bonjour")
    public String bonjour(@RequestParam(name = "name", defaultValue = "Edacy", required = false) String name, Model model){

        model.addAttribute("name", name);

        return "home.html";
    }



}
