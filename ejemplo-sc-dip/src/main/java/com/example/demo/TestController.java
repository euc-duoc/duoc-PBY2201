package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    @Qualifier("feliz")
    private Tester tester;

    @GetMapping("/verMensaje")
    public String verMensaje() {
        return tester.obtenerMensaje();
    }
}
