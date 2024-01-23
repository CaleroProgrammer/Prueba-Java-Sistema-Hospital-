package com.karlaCalero.SistemaHospitalBackend.Controller;

import com.karlaCalero.SistemaHospitalBackend.Model.Cita;
import com.karlaCalero.SistemaHospitalBackend.Model.Consultorio;
import com.karlaCalero.SistemaHospitalBackend.Services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class CitaRest {
@Autowired
    CitaService citaService;

@GetMapping("/citas/{fecha}/{doctor}/{consultorio}")
    public ResponseEntity<?> consultarCitas(@PathVariable String fecha,@PathVariable int doctor,@PathVariable int consultorio){
    try{
        List<Cita> citas=citaService.getCitas(fecha,doctor,consultorio);
        return ResponseEntity.ok(citas.toString());
    }
    catch (Exception e){
        return ResponseEntity.status(500).body("Hubo un problema al consultar la información. Intente más tarde.");
    }
}

    @PostMapping("/citasAgregar")
    public ResponseEntity<?> agregarCitas(@RequestBody Cita cita){
        try{
            Cita citaCreada=citaService.crearCita(cita);
            if(citaCreada.getId()>0) {
                return ResponseEntity.ok("Se creó la cita exitosamente.");
            }
            else {
                return ResponseEntity.status(500).body("Hubo un problema al crear la información. Intente más tarde.");
            }

        }
        catch (Exception e){
            return ResponseEntity.status(500).body("Hubo un problema al crear la información. Intente más tarde.");
        }
    }


    @PutMapping("/citasModificar/{id}")
    public ResponseEntity<?> editarCitas(@RequestBody Cita cita,@PathVariable int id){

        try{
            Boolean citaCreada=citaService.editarCita(cita,id);
            if(citaCreada) {
                return ResponseEntity.ok("Se editó la cita exitosamente.");
            }
            else {
                return ResponseEntity.status(500).body("Hubo un problema al editar la información. Intente más tarde.");
            }

        }
        catch (Exception e){
            return ResponseEntity.status(500).body("Hubo un problema al editar la información. Intente más tarde.");
        }
    }
    @PutMapping("/citasCancelar/{id}")
    public ResponseEntity<?> cancelarCitas(@PathVariable int id){
        try{
            boolean esCancelada=citaService.cancelarCita(id);
            if(esCancelada) {
                return ResponseEntity.ok("Se canceló la cita exitosamente.");
            }
            else {
                return ResponseEntity.status(500).body("Hubo un problema al cancelar la información. Intente más tarde.");
            }

        }
        catch (Exception e){
            return ResponseEntity.status(500).body("Hubo un problema al cancelar la información. Intente más tarde.");
        }
    }

}
