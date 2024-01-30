package com.karlaCalero.SistemaHospitalBackend.Model;

import com.karlaCalero.SistemaHospitalBackend.Util.Persona;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="paciente")
public class Paciente extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Paciente(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.setNombre(nombre);
        this.setApellidoPaterno(apellidoPaterno);
        this.setApellidoMaterno(apellidoMaterno);
    }

    public Paciente() {

    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre="+this.getNombre()+
                ", apellidoPaterno="+this.getApellidoPaterno()+
                ", apellidoMaterno="+this.getApellidoMaterno()+
                '}';
    }
}
