package com.karlaCalero.SistemaHospitalBackend.Services.impl;

import com.karlaCalero.SistemaHospitalBackend.Model.Doctor;
import com.karlaCalero.SistemaHospitalBackend.Repository.DoctorRepository;
import com.karlaCalero.SistemaHospitalBackend.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getDoctores(){
        return doctorRepository.findAll();
    }
}
