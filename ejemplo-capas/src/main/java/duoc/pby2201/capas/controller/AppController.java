package duoc.pby2201.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import duoc.pby2201.capas.model.AreaSilvestre;
import duoc.pby2201.capas.model.TipoAreaSilvestre;
import duoc.pby2201.capas.service.AreaSilvestreService;

@RestController
public class AppController {
    @Autowired
    private AreaSilvestreService serv;

    @GetMapping("/areasSilvestresTexto")
    public String mostrarAreasSilvestresTexto() {
      return serv.obtenerDatosAreasSilvestresTexto();
    }

    @GetMapping("/areasSilvestres")
    public List<AreaSilvestre> mostrarAreasSilvestres() {
      return serv.obtenerAreasSilvestres();
    }

    @GetMapping("/areasSilvestres/{id}")
    public AreaSilvestre mostrarAreaSilvestre(@PathVariable Integer id) {
      return serv.obtenerAreaSilvestre(id).get();
    }

    @GetMapping("/areasSilvestres/tipo/{tipo}")
    public List<AreaSilvestre> mostrarAreaSilvestre(@PathVariable TipoAreaSilvestre tipo) {
      return serv.obtenerAreasSilvestresPorTipo(tipo);
    }
}
