package com.karlaCalero.SistemaHospitalBackend.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="consultorio")
public class Consultorio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="numero_consultorio")
    private String numeroConsultorio;
    @Column(name="no_piso")
    private String noPiso;
}