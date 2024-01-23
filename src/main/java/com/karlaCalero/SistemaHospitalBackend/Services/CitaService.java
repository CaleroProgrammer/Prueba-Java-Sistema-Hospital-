package com.karlaCalero.SistemaHospitalBackend.Services;

import com.karlaCalero.SistemaHospitalBackend.Model.Cita;
import com.karlaCalero.SistemaHospitalBackend.Model.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CitaService {
    List<Cita> getCitas(String fecha,int idDoctor, int idConsultorio);
    Cita crearCita(Cita cita);

    Boolean editarCita(Cita cita,int id);

    Boolean cancelarCita (int id);
}
