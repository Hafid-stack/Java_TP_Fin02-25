package com.enset.java_avance_tp_findemodule.service;

import com.enset.java_avance_tp_findemodule.entities.Patient;
import com.enset.java_avance_tp_findemodule.interfaces.IPatientService;
import com.enset.java_avance_tp_findemodule.interfaces.IpatientDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientService implements IPatientService {
    private IpatientDAO ipatientDAO;
    public PatientService(IpatientDAO patientDAO) {
        this.ipatientDAO = patientDAO;

    }
    @Override
    public void addPatient(Patient patient) {
        try {
            ipatientDAO.insert(patient );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePatient(Patient patient) {
        try {
            ipatientDAO.update(patient);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePatient(Patient patient) {
        try {
            ipatientDAO.delete(patient);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Patient> getAllPatients() {
        List<Patient> patients;
        try {
           patients  = ipatientDAO.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return patients;
    }

    @Override
    public Patient getPatientById(Long id) {
        Patient patient = null;
        try {
            patient = ipatientDAO.getById(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return patient;
    }
}
