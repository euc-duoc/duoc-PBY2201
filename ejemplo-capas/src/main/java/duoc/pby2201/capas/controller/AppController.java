package duoc.pby2201.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import duoc.pby2201.capas.service.AreaSilvestreService;

@RestController
public class AppController {
    @Autowired
    private AreaSilvestreService serv;

    @GetMapping("/areasSilvestres")
    public String mostrarAreasSilvestres() {
      return serv.obtenerDatosAreasSilvestres();
    }
}
