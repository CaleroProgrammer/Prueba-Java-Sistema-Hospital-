package com.karlaCalero.SistemaHospitalBackend.Services.impl;

import com.karlaCalero.SistemaHospitalBackend.Model.Cita;
import com.karlaCalero.SistemaHospitalBackend.Model.Consultorio;
import com.karlaCalero.SistemaHospitalBackend.Repository.CitaRepository;
import com.karlaCalero.SistemaHospitalBackend.Repository.ConsultorioRepository;
import com.karlaCalero.SistemaHospitalBackend.Services.CitaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImpl implements CitaService {
    @Autowired
    CitaRepository citaRepository;

    @Override
    public List<Cita> getCitas(String fecha,int idDoctor, int idConsultorio){
        return citaRepository.findCitaByHorarioConsultaAndAndIdDoctorAndIdConsultorio(fecha,idDoctor,idConsultorio);
    }

    @Override
    public Cita crearCita(Cita cita) {

        return citaRepository.save(cita);
    }

    @Override
    public Boolean editarCita(Cita cita, int id) {
        Cita citaEditar=citaRepository.getReferenceById(id);
        if(citaEditar.getId()>0){
            citaEditar=cita;
            citaRepository.save(citaEditar);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Boolean cancelarCita(int id) {
        Cita citaCancelar=citaRepository.getReferenceById(id);
        if(citaCancelar.getId()>0){
            citaCancelar.setEstaCancelada(true);
           citaRepository.save(citaCancelar);
           return true;
        }
        else{
            return false;
        }
    }


}
