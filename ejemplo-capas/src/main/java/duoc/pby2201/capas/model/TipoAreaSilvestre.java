package duoc.pby2201.capas.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TipoAreaSilvestre {
    @JsonProperty("Parque Nacional")
    PARQUE_NACIONAL,
    @JsonProperty("Reserva Nacional")
    RESERVA_NACIONAL;
}
