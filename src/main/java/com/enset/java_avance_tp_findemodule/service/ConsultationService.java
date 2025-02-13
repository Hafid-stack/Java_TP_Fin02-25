package com.enset.java_avance_tp_findemodule.service;

import com.enset.java_avance_tp_findemodule.entities.Consultation;
import com.enset.java_avance_tp_findemodule.interfaces.IConsultationDAO;
import com.enset.java_avance_tp_findemodule.interfaces.IConsultationService;

import java.sql.SQLException;
import java.util.List;

public class ConsultationService implements IConsultationService {
    private IConsultationDAO consultationDAO;
    public ConsultationService(IConsultationDAO consultationDAO) {
        this.consultationDAO = consultationDAO;
    }
    @Override
    public void addConsultation(Consultation consultation) {
        try {
            consultationDAO.insert(consultation);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateConsultation(Consultation consultation) {
        try {
            consultationDAO.update(consultation);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteConsultation(Consultation consultation) {
        try {
            consultationDAO.delete(consultation);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Consultation> getConsultations() {
        List<Consultation> consultations = null;
        try {
           consultations= consultationDAO.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return consultations;
    }

    @Override
    public Consultation getConsultationById(Long id) {
        Consultation consultation = null;
        try {
            consultation=consultationDAO.getById(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return consultation;
    }
}
