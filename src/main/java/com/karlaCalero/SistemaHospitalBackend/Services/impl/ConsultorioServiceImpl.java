package com.karlaCalero.SistemaHospitalBackend.Services.impl;

import com.karlaCalero.SistemaHospitalBackend.Model.Consultorio;
import com.karlaCalero.SistemaHospitalBackend.Model.Doctor;
import com.karlaCalero.SistemaHospitalBackend.Repository.ConsultorioRepository;
import com.karlaCalero.SistemaHospitalBackend.Repository.DoctorRepository;
import com.karlaCalero.SistemaHospitalBackend.Services.ConsultorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioServiceImpl implements ConsultorioService {
    @Autowired
    ConsultorioRepository consultorioRepository;

    @Override
    public List<Consultorio> getConsultorios(){
        return consultorioRepository.findAll();
    }
}
