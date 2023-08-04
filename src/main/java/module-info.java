module project.slr.projects {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens project.slr.projects to javafx.fxml;
    exports project.slr.projects;
}