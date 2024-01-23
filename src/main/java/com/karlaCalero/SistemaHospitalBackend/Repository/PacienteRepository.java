package com.karlaCalero.SistemaHospitalBackend.Repository;

import com.karlaCalero.SistemaHospitalBackend.Model.Consultorio;
import com.karlaCalero.SistemaHospitalBackend.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Persona,Integer> {
}
