package com.enset.java_avance_tp_findemodule.applications;

import com.enset.java_avance_tp_findemodule.DAO.ConsultationDAO;
import com.enset.java_avance_tp_findemodule.DAO.PatientDAO;
import com.enset.java_avance_tp_findemodule.entities.Patient;
import com.enset.java_avance_tp_findemodule.interfaces.IConsultationService;
import com.enset.java_avance_tp_findemodule.interfaces.IPatientService;
import com.enset.java_avance_tp_findemodule.service.ConsultationService;
import com.enset.java_avance_tp_findemodule.service.PatientService;

public class Test1 {
    public static void main(String[] args) {
        IPatientService patientService = new PatientService(new PatientDAO());
        IConsultationService consultationService = new ConsultationService(new ConsultationDAO());
//Testing if the connextion is established with DataBase and if function is working
       /* Patient patient = new Patient();
        patient.setFirstName("patient1");
        patient.setLastName("patient10");
        patient.setTel("45145125112");
        patientService.addPatient(patient);
    }*/

}
