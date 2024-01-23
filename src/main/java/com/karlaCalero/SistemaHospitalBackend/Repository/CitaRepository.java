package com.karlaCalero.SistemaHospitalBackend.Repository;

import com.karlaCalero.SistemaHospitalBackend.Model.Cita;
import com.karlaCalero.SistemaHospitalBackend.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CitaRepository extends JpaRepository<Cita,Integer> {
    public List<Cita>findCitaByHorarioConsultaAndAndIdDoctorAndIdConsultorio(String horarioConsulta,int idDoctor, int idConsultorio);
}
