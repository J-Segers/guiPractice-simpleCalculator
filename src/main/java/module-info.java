module nl.atjays.simplecalc {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens nl.atjays.simplecalc to javafx.fxml;
    exports nl.atjays.simplecalc;
}
