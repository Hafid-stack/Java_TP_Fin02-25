package com.enset.java_avance_tp_findemodule.DAO;

import com.enset.java_avance_tp_findemodule.connection.BDConnection;
import com.enset.java_avance_tp_findemodule.entities.Consultation;
import com.enset.java_avance_tp_findemodule.interfaces.IConsultationDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultationDAO implements IConsultationDAO {
    @Override
    public void insert(Consultation consultation) throws SQLException {
Connection con = BDConnection.getConnection();
PreparedStatement ps =con.prepareStatement("insert into Consultation(Date,Description,)"+"values (?,?)");
ps.setDate(1,consultation.getDate());
ps.setString(2,consultation.getDescription());
ps.execute();
    }

    @Override
    public void update(Consultation consultation) throws SQLException {
Connection con = BDConnection.getConnection();
PreparedStatement psm=con.prepareStatement("UPDATE consultation set Date=?,Description=? where ID_Consultation=?");
psm.setDate(1,consultation.getDate());
psm.setString(2,consultation.getDescription());
psm.setLong(3,consultation.getId());
psm.execute();
    }

    @Override
    public void delete(Consultation consultation) throws SQLException {
Connection con = BDConnection.getConnection();
PreparedStatement psm=con.prepareStatement("DELETE  from Consultation where ID_Consultation=?");
psm.setLong(1,consultation.getId());
psm.execute();
    }

    @Override
    public List<Consultation> getAll() throws SQLException {

        Connection con = BDConnection.getConnection();
        PreparedStatement psm=con.prepareStatement("SELECT * from Consultation");
        ResultSet rs=psm.executeQuery();
        List<Consultation> consultations=new ArrayList<>();
        while (rs.next()){
            Consultation consultation=new Consultation();
            consultation.setId(rs.getLong("ID_Consultation"));
            consultation.setDate(rs.getDate("Date"));
            consultation.setDescription(rs.getString("Description"));
            consultations.add(consultation);
        }
        return consultations;
    }

    @Override
    public Consultation getById(Long id) throws SQLException {
        Connection con = BDConnection.getConnection();
        PreparedStatement psm=con.prepareStatement("SELECT from Consultation where ID_Consultation=?");
                psm.setLong(1,id);
        ResultSet rs=psm.executeQuery();
        Consultation consultation=new Consultation();
        while (rs.next()){
            consultation.setId(rs.getLong("ID_Consultation"));
            consultation.setDate(rs.getDate("Date"));
            consultation.setDescription(rs.getString("Description"));

        }
        return consultation;
    }
}
