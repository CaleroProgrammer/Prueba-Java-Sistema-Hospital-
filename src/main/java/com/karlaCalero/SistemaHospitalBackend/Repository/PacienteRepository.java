package com.karlaCalero.SistemaHospitalBackend.Repository;

import com.karlaCalero.SistemaHospitalBackend.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Integer> {
}
