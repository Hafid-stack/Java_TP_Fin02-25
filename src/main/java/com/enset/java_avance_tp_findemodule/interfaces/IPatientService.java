package com.enset.java_avance_tp_findemodule.interfaces;

import com.enset.java_avance_tp_findemodule.entities.Patient;

import java.util.List;

public interface IPatientService {
    void addPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);

}
