package com.karlaCalero.SistemaHospitalBackend.Services;

import com.karlaCalero.SistemaHospitalBackend.Model.Consultorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConsultorioService {
    public List<Consultorio> getConsultorios();
}
