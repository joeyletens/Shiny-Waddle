package Student.GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class GUIStudent extends Application {

  @Override
  public void start(Stage window) {

    // 1. Create main layout
    BorderPane mainLayout = new BorderPane();

    // 1.1 Create buttons for menu
    HBox menu = new HBox();
    menu.setPadding(new Insets(20, 20, 20, 20));
    menu.setSpacing(10);

    // 1.2 Create buttons for menu
    Label studentLabel = new Label("Student");
    Button createStudent = new Button("Add");
    Button readStudent = new Button("Read");
    Button updateStudent = new Button("Update");
    Button deleteStudent = new Button("Delete");

    // 1.3 Add buttons to menu
    menu.getChildren().addAll(studentLabel, createStudent, readStudent, updateStudent, deleteStudent);
    mainLayout.setTop(menu);

    // 2. Create Create student subview layout
    // Create vertial box to add all horizontal boxes
    VBox createStudentForm = new VBox();
    createStudentForm.setSpacing(30);

    // LAST set scene to create student
    mainLayout.setCenter(createStudentForm);
    Scene view = new Scene(mainLayout);

    // Start application, set title, set scene and show window
    window.setTitle("Joey Letens");
    window.setScene(view); // Set the scene
    window.show();
  }

  public static void main(String[] args) {
    // Launches the graphical user interface
    launch(GUIStudent.class);
  }

}
