package cl.duoc.cruddb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AreaSilvestre {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private int visitasChilenos;
    private int visitasExtranjeros;
    private TipoAreaSilvestre tipo;
}
