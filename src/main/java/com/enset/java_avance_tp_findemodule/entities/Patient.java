package com.enset.java_avance_tp_findemodule.entities;

public class Patient {
    private long id;
    private String firstName;
    private String lastName;
    private String tel;

    public Patient() {
    }

    public Patient(String firstName, String lastName, String tel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
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

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
