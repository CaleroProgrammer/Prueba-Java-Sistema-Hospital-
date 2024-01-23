package com.karlaCalero.SistemaHospitalBackend.Repository;

import com.karlaCalero.SistemaHospitalBackend.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
