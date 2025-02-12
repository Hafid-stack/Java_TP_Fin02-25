package com.enset.java_avance_tp_findemodule.entities;

import java.sql.Date;

public class Consultation {
    private long id;
  private Date date;
  private String Description;


    public Consultation() {
    }

    public Consultation(long id, Date date, String description) {
        this.id = id;
        this.date = date;
        Description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", date=" + date +
                ", Description='" + Description + '\'' +
                '}';
    }
}
