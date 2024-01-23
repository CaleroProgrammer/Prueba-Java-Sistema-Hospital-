package com.karlaCalero.SistemaHospitalBackend.Controller;

import com.karlaCalero.SistemaHospitalBackend.Model.Doctor;
import com.karlaCalero.SistemaHospitalBackend.Services.CitaService;
import com.karlaCalero.SistemaHospitalBackend.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class DoctorRest {
    @Autowired
    DoctorService doctorService;

    @GetMapping("/doctores")
    public ResponseEntity<?> consultarDoctores(){
        try{
            List<Doctor> doctores=doctorService.getDoctores();
            return ResponseEntity.ok(doctores.toString());
        }
        catch (Exception e){
            return ResponseEntity.status(500).body("Hubo un problema al consultar la información. Intente más tarde.");
        }

    }
}
