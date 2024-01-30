package com.karlaCalero.SistemaHospitalBackend.Services;

import com.karlaCalero.SistemaHospitalBackend.Model.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PacienteService {
    public List<Paciente> getPacientes();
}
