package com.karlaCalero.SistemaHospitalBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name="doctor")
public class Doctor extends Persona{
    private String especialidad;
}
