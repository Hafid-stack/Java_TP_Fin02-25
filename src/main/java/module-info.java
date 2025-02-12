module com.enset.java_avance_tp_findemodule {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.enset.java_avance_tp_findemodule to javafx.fxml;
    exports com.enset.java_avance_tp_findemodule;
}