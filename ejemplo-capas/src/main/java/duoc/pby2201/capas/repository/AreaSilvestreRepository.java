package duoc.pby2201.capas.repository;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import duoc.pby2201.capas.model.AreaSilvestre;

@Repository
public class AreaSilvestreRepository {

    private List<AreaSilvestre> leerDatos() {
        String datosTexto = null;

        try {
            datosTexto = FileUtils.readFileToString(
                new File("./datos.json"), 
                StandardCharsets.UTF_8
            );
        }
        catch(IOException e) {
            throw new RuntimeException("Error leyendo datos", e);
        }        

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.readValue(datosTexto, new TypeReference<List<AreaSilvestre>>(){});
        }
        catch(IOException e) {
            throw new RuntimeException("Error en formato JSON", e);
        }
    }

    public Optional<AreaSilvestre> findById(Integer id) {
        return leerDatos().stream().filter((as) -> as.getId() == id).findFirst();
    }

    public boolean existsById(Integer id) {
        return !findById(id).isEmpty();
    }

    public Iterable<AreaSilvestre> findAll() {
        return leerDatos();
    }

    public long count() {
        return leerDatos().size();
    }
}
