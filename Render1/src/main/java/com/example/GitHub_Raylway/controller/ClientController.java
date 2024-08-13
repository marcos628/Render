package com.example.GitHub_Raylway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class ClientController {

    @GetMapping("/{name}")
    public String GetName(@PathVariable String name){
        return "<h2 style='text-align: center; margin-top: 60px'>Mi nombre es '"+name+"'</h2>";
    }
}