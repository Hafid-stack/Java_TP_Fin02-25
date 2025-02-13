package com.enset.java_avance_tp_findemodule.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface DAO <E,T>{
    void insert(E e) throws SQLException;
    void update(E e) throws SQLException;
    void delete(E e) throws SQLException;
    List<E> getAll() throws SQLException;
    E getById(int id) throws SQLException;

}
