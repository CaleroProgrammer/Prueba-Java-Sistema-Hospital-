package com.karlaCalero.SistemaHospitalBackend.Controller;
import com.karlaCalero.SistemaHospitalBackend.Model.Persona;
import com.karlaCalero.SistemaHospitalBackend.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class PacienteRest {
    @Autowired
    PacienteService pacienteService;

    @GetMapping("/pacientes")
    public ResponseEntity<?> consultarPacientes(){
        try{
            List<Persona>pacientes=pacienteService.getPacientes();
            return ResponseEntity.ok(pacientes.toString());
        }
        catch (Exception e){
            return ResponseEntity.status(500).body("Hubo un problema al consultar la información. Intente más tarde.");
        }

    }
}
