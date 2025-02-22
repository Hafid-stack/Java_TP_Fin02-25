module com.enset.java_avance_tp_findemodule {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;

    exports com.enset.java_avance_tp_findemodule.applications;
    exports com.enset.java_avance_tp_findemodule.DAO;
    exports com.enset.java_avance_tp_findemodule.entities;
    exports com.enset.java_avance_tp_findemodule.interfaces;
    exports com.enset.java_avance_tp_findemodule.service;
    exports com.enset.java_avance_tp_findemodule.controller;

    opens com.enset.java_avance_tp_findemodule.applications to javafx.fxml;
    opens com.enset.java_avance_tp_findemodule.entities to javafx.fxml;
    opens com.enset.java_avance_tp_findemodule.controller to javafx.fxml;

}