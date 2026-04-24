package cl.duoc.cruddb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.cruddb.model.AreaSilvestre;
import cl.duoc.cruddb.model.TipoAreaSilvestre;
import cl.duoc.cruddb.repository.AreaSilvestreRepository;

@Service
public class AreaSilvestreService {
    @Autowired
    private AreaSilvestreRepository repo;

    public List<AreaSilvestre> obtenerAreasSilvestres() {
        return repo.findAll();
    }

    public Optional<AreaSilvestre> obtenerAreaSilvestre(int id) {
        return repo.findById(id);
    }

    public List<AreaSilvestre> obtenerAreasSilvestresPorTipo(TipoAreaSilvestre tipo) {
        return repo.findAll().stream().filter((as) -> as.getTipo() == tipo).toList();
    }

    public String obtenerDatosAreasSilvestresTexto() {
        StringBuilder sb = new StringBuilder();
        List<AreaSilvestre> areas = repo.findAll();

        for(AreaSilvestre as: areas) {
            sb.append(String.format("""
                \u00c1rea silvestre %d:
                Nombre: %s
                Total turistas chilenos: %d
                Total turistas extranjeros: %d
                Total turistas: %d
                """,
                as.getId(),
                as.getNombre(),
                as.getVisitasChilenos(),
                as.getVisitasExtranjeros(),
                as.getVisitasChilenos() + as.getVisitasExtranjeros()
            ));            
        }

        return sb.toString();
    }

    public AreaSilvestre guardarAreaSilvestre(AreaSilvestre as) {
        return repo.save(as);
    }
}
