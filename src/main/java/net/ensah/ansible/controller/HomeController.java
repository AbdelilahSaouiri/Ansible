package net.ensah.ansible.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/ansible")
public class HomeController {


    @GetMapping("/{name}")
    public String Hello(@PathVariable(name = "name") String name){

        return "hello "+name;
    }
}
