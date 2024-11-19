module com.mycompany.somarnumeros {
    requires javafx.controls;
    requires javafx.fxml;

    opens Principal to javafx.fxml;
    exports Principal;
}
