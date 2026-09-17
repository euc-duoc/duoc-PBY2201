package cl.duoc.cruddb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.cruddb.model.AreaSilvestre;
import cl.duoc.cruddb.model.TipoAreaSilvestre;
import cl.duoc.cruddb.service.AreaSilvestreService;

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

    @PostMapping("/crearAreaSilvestre")
    public ResponseEntity<AreaSilvestre> crearAreaSilvestre(@RequestBody AreaSilvestre as) {

        AreaSilvestre nueva = serv.guardarAreaSilvestre(as);
        return new ResponseEntity<>(nueva, HttpStatus.OK);
    }
}
