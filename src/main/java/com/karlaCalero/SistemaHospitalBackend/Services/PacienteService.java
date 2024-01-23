package com.karlaCalero.SistemaHospitalBackend.Services;

import com.karlaCalero.SistemaHospitalBackend.Model.Consultorio;
import com.karlaCalero.SistemaHospitalBackend.Model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PacienteService {
    public List<Persona> getPacientes();
}
