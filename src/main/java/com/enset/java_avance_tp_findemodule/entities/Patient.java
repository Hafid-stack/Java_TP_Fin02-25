package com.enset.java_avance_tp_findemodule.entities;

import java.util.List;

public class Patient {
    private long id;
    private String firstName;
    private String lastName;
    private String tel;
    private List<Consultation> consultations;

    public Patient() {
    }

    public Patient(long id, String firstName, String lastName, String tel, List<Consultation> consultations) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
        this.consultations = consultations;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        this.consultations = consultations;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tel='" + tel + '\'' +
                ", consultations=" + consultations +
                '}';
    }
}
