package duoc.pby2201.capas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duoc.pby2201.capas.model.AreaSilvestre;
import duoc.pby2201.capas.repository.AreaSilvestreRepository;

@Service
public class AreaSilvestreService {
    @Autowired
    private AreaSilvestreRepository repo;

    public String obtenerDatosAreasSilvestres() {
        StringBuilder sb = new StringBuilder();
        Iterable<AreaSilvestre> areas = repo.findAll();

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
}
