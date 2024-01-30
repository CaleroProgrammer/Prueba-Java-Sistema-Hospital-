package com.karlaCalero.SistemaHospitalBackend.Model;

import com.karlaCalero.SistemaHospitalBackend.Util.Persona;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="doctor")
public class Doctor extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String especialidad;

    public Doctor(String nombre, String apellidoPaterno, String apellidoMaterno, String especialidad) {
        this.setNombre(nombre);
        this.setApellidoPaterno(apellidoPaterno);
        this.setApellidoMaterno(apellidoMaterno);
        this.especialidad = especialidad;
    }

    public Doctor() {

    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", nombre="+this.getNombre()+
                ", apellidoPaterno="+this.getApellidoPaterno()+
                ", apellidoMaterno="+this.getApellidoMaterno()+
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
