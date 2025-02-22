package com.enset.java_avance_tp_findemodule.controller;

import com.enset.java_avance_tp_findemodule.DAO.ConsultationDAO;
import com.enset.java_avance_tp_findemodule.entities.Consultation;
import com.enset.java_avance_tp_findemodule.entities.Patient;
import com.enset.java_avance_tp_findemodule.interfaces.IConsultationService;
import com.enset.java_avance_tp_findemodule.interfaces.IPatientService;
import com.enset.java_avance_tp_findemodule.service.ConsultationService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

public class ConsultationController  {
    //add implements Initializable
//    //variables
//    @FXML private DatePicker conDate;
//    @FXML private ComboBox conPatient;
//    @FXML private TextArea description;
//    //buttons
//    @FXML private Button buttonAdd;
//    @FXML private Button buttonDel;
//    @FXML private Button buttonUp;
//    @FXML private TextField fieldSearch;
//    //table
//    @FXML private TableView tabelConsultation;
//    @FXML private TableColumn colID;
//    @FXML private TableColumn colDate;
//    @FXML private TableColumn colDescription;
//    @FXML private TableColumn colPatient;
//
//    private IConsultationService consultationService;
//    private IPatientService patientService;
//    private ObservableList<Patient> patientList= FXCollections.observableArrayList();
//
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        consultationService =new ConsultationService(new ConsultationDAO());
//        conPatient.setItems(patientList);
//        patientList.setAll(patientService.getAllPatients());
//
//    }
//    public void addConsultation(){
//        Consultation consultation = new Consultation();
//        consultation.setDate(Date.valueOf(conDate.getValue()));
//        consultation.setDescription(description.getText());
//        //add getpatient to either consultation or consultationDAO
////        consultation.setId(conPatient.getSelectionModel().getSelectedItem());
//        consultationService.addConsultation(consultation);
//    }
}
