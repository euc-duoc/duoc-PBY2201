package cl.duoc.cruddb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TipoAreaSilvestre {
    @JsonProperty("Parque Nacional")
    PARQUE_NACIONAL,
    @JsonProperty("Reserva Nacional")
    RESERVA_NACIONAL;
}
