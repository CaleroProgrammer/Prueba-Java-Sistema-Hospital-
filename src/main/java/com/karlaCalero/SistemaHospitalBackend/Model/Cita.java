package com.karlaCalero.SistemaHospitalBackend.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "id_doctor")
    private int idDoctor;
    @Column(name = "id_consultorio")
    private int idConsultorio;
    @Column(name = "id_paciente")
    private int idPaciente;
    @Column(name = "horario_consulta")
    private String horarioConsulta;
    @Column(name="esta_cancelada")
    private Boolean estaCancelada;



}
