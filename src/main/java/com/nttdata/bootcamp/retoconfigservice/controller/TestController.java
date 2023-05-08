package com.nttdata.bootcamp.retoconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${persona.nombre}")
    private String miNombre;

    @Value("${persona.edad}")
    private int miEdad;

    @GetMapping("/getNombre")
    public String getMiNombre() {

        return this.miNombre;

    }

}
