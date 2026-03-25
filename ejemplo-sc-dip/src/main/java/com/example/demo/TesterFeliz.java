package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("feliz")
public class TesterFeliz implements Tester {

    @Override
    public String obtenerMensaje() {
        return "Hoy será un gran día";
    }

}
