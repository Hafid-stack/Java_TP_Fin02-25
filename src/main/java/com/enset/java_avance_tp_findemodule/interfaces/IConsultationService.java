package com.enset.java_avance_tp_findemodule.interfaces;

import com.enset.java_avance_tp_findemodule.entities.Consultation;

import java.util.List;

public interface IConsultationService {
    void addConsultation(Consultation consultation);
    void updateConsultation(Consultation consultation);
    void deleteConsultation(Consultation consultation);
    List<Consultation> getConsultations();
    Consultation getConsultationById(Long id);
}
