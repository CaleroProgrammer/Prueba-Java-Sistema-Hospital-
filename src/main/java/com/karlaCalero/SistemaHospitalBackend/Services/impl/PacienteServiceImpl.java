package com.karlaCalero.SistemaHospitalBackend.Services.impl;

import com.karlaCalero.SistemaHospitalBackend.Model.Doctor;
import com.karlaCalero.SistemaHospitalBackend.Model.Persona;
import com.karlaCalero.SistemaHospitalBackend.Repository.DoctorRepository;
import com.karlaCalero.SistemaHospitalBackend.Repository.PacienteRepository;
import com.karlaCalero.SistemaHospitalBackend.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public List<Persona> getPacientes(){
        return pacienteRepository.findAll();
    }
}
