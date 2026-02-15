package com.pm.agcbapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agcb")
public class AgcbController {

    @GetMapping
    public String dummyMethod(){
        return "Hello";
    }
}
