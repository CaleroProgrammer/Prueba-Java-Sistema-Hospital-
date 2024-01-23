package com.karlaCalero.SistemaHospitalBackend.Services;

import com.karlaCalero.SistemaHospitalBackend.Model.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DoctorService {
    List<Doctor> getDoctores();
}
