package duoc.pby2201.capas.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AreaSilvestre {
    private int id;
    private String nombre;
    private int visitasChilenos;
    private int visitasExtranjeros;
    private TipoAreaSilvestre tipo;
}
