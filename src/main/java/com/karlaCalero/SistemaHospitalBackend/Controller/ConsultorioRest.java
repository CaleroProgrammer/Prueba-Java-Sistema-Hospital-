package com.karlaCalero.SistemaHospitalBackend.Controller;

import com.karlaCalero.SistemaHospitalBackend.Model.Consultorio;
import com.karlaCalero.SistemaHospitalBackend.Services.ConsultorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class ConsultorioRest {
    @Autowired
    ConsultorioService consultorioService;

    @GetMapping("/consultorios")
    public ResponseEntity<?> consultarConsultorios(){
        try{
            List<Consultorio> consultorios=consultorioService.getConsultorios();
            return ResponseEntity.ok(consultorios.toString());
        }
        catch (Exception e){
            return ResponseEntity.status(500).body("Hubo un problema al consultar la información. Intente más tarde.");
        }

    }
}
