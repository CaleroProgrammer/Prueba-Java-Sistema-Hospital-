package com.karlaCalero.SistemaHospitalBackend.Util;

import jakarta.persistence.*;
import lombok.Data;


@MappedSuperclass
@Data
public class Persona {
    @Column(name="nombre",length=255)
    private String nombre;
    @Column(name="apellido_paterno",length=255)
    private String apellidoPaterno;
    @Column(name="apellido_materno",length=255)
    private String apellidoMaterno;

}
