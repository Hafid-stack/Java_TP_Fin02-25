module com.enset.java_avance_tp_findemodule {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    exports com.enset.java_avance_tp_findemodule.applications;
    exports com.enset.java_avance_tp_findemodule.DAO;
    exports com.enset.java_avance_tp_findemodule.entities;
    exports com.enset.java_avance_tp_findemodule.interfaces;
    exports com.enset.java_avance_tp_findemodule.service;

    opens com.enset.java_avance_tp_findemodule.applications to javafx.fxml;
}