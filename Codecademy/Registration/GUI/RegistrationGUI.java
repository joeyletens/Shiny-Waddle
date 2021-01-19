package Registration.GUI;

import Registration.Database.RegistrationDatabase;
import Student.Database.CRUDStudent;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class RegistrationGUI extends Application {
  @Override
  public void start(Stage window) {

    // 1. Create main layout
    BorderPane mainLayout = new BorderPane();

    // 1.1 Create buttons for menu
    HBox menu = new HBox();
    menu.setPadding(new Insets(20, 20, 20, 20));
    menu.setSpacing(10);

    // 1.2 Create buttons for menu
    Label studentLabel = new Label("Certificate");
    Button createStudentButton = new Button("Add");
    Button readStudentButton = new Button("Read");
    Button changeStudentButton = new Button("Change");
    Button deleteStudentButton = new Button("Delete");

    // 1.3 Add buttons to menu
    menu.getChildren().addAll(studentLabel, createStudentButton, readStudentButton, changeStudentButton,
        deleteStudentButton);
    mainLayout.setTop(menu);

    // 2. Create CREATE STUDENT subview layout
    VBox createStudentView = new VBox(new Label("Enter new registration's details below"));
    createStudentView.setSpacing(30);
    Button addRegistration = new Button("add student");

    // 2. Add horizontal EMAIL box
    TextField emailInput = new TextField("");
    HBox email = new HBox(new Label("email:"));
    email.getChildren().add(emailInput);

    // 2. Add horizontal COURSE box
    TextField courseInput = new TextField("");
    HBox course = new HBox(new Label("Course id:"));
    course.getChildren().add(courseInput);

    // 2. Add horizontal DATE box
    TextField dateInput = new TextField("");
    HBox date = new HBox(new Label("Date:"));
    date.getChildren().add(dateInput);

    // 2.1 add to parent node ADD TO CREATE STUDENT FORM
    createStudentView.getChildren().addAll(email, course, date, addRegistration);

    // 6.1 add subview buttons
    createStudentButton.setOnAction((event) -> mainLayout.setCenter(createStudentView));

    // Submit new registration
    addRegistration.setOnAction((event) -> RegistrationDatabase.addRegistrationToDatabase(emailInput.getText(),
        Integer.parseInt(courseInput.getText()), dateInput.getText()));

    // 6.2 set scene to create student AS STANDARD
    mainLayout.setCenter(createStudentView);
    Scene view = new Scene(mainLayout);

    // 7. Start application, set title, set scene and show window
    window.setTitle("Joey Letens");
    window.setScene(view); // Set the scene
    window.show();
  }

  public static void main(String[] args) {
    // Launches the graphical user interface
    launch(RegistrationGUI.class);
  }

}
