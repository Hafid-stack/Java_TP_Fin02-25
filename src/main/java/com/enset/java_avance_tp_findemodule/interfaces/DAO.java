package com.enset.java_avance_tp_findemodule.interfaces;

import java.util.List;

public interface DAO <E,T>{
    void insert(E e);
    void update(E e);
    void delete(E e);
    List<E> getAll();
    E getById(int id);

}
