package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("triste")
public class TesterTriste implements Tester {

    @Override
    public String obtenerMensaje() {
        return "Hoy no me molesten!";
    }
}
