package com.enset.java_avance_tp_findemodule.DAO;

import com.enset.java_avance_tp_findemodule.connection.BDConnection;
import com.enset.java_avance_tp_findemodule.entities.Patient;
import com.enset.java_avance_tp_findemodule.interfaces.IpatientDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO implements IpatientDAO {
    @Override
    public void insert(Patient patient) throws SQLException {
Connection connection= BDConnection.getConnection();
PreparedStatement preparedStatement=connection.prepareStatement("insert into Patient(First_Name,Last_Name,Tel)"+"values (?,?,?)");
preparedStatement.setString(1,patient.getFirstName());
preparedStatement.setString(2,patient.getLastName());
preparedStatement.setString(3, patient.getTel());
preparedStatement.execute();



    }

    @Override
    public void update(Patient patient) throws SQLException {
Connection connection= BDConnection.getConnection();
PreparedStatement psm=connection.prepareStatement("update Patient set First_NAME=?,Last_Name=?,Tel=? where ID_Patient=?");
        psm.setString(1,patient.getFirstName());
psm.setString(2,patient.getLastName());
psm.setString(3,patient.getTel());
psm.setLong(4,patient.getId());
    }

    @Override
    public void delete(Patient patient) throws SQLException {
Connection connection= BDConnection.getConnection();
PreparedStatement psm=connection.prepareStatement("DELETE from Patient where ID_Patient=?")
        psm.setLong(1,patient.getId());
psm.execute();
    }

    @Override
    public List<Patient> getAll() throws SQLException {
        Connection connection= BDConnection.getConnection();

        PreparedStatement psm=connection.prepareStatement("select * from Patient");
        ResultSet rs =psm.executeQuery();
        List<Patient> patients=new ArrayList<>();
        while (rs.next()){
            Patient patient=new Patient();
            patient.setId(rs.getLong("ID_Patient"));
            patient.setFirstName(rs.getString("First_Name"));
            patient.setLastName(rs.getString("Last_Name"));
            patient.setTel(rs.getString("Tel"));
            patients.add(patient);

        }

        return patients;
    }

    @Override
    public Patient getById(int id) throws SQLException {

        Connection connection= BDConnection.getConnection();
        PreparedStatement psm=connection.prepareStatement("SELECT * from Patient where ID_Patient=?");
        psm.setLong(1,id);
        ResultSet rs =psm.executeQuery();
        Patient patient=new Patient();
        while (rs.next()){
            patient.setId(rs.getLong("ID_Patient"));
            patient.setFirstName(rs.getString("First_Name"));
            patient.setLastName(rs.getString("Last_Name"));
            patient.setTel(rs.getString("Tel"));

        }
        return patient;
    }
}
