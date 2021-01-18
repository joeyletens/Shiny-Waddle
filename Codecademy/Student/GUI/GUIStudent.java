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

    // 2. Create CREATE STUDENT subview layout
    // Create vertial box to add all horizontal boxes
    VBox createStudentForm = new VBox();
    createStudentForm.setSpacing(30);

    // Add horizontal FIRSTNAME box
    TextField inputFirstName = new TextField("");
    HBox firstName = new HBox(new Label("First name:"));
    firstName.getChildren().add(inputFirstName);

    // Add horizontal LASTNAME box
    TextField inputLastName = new TextField("");
    HBox lastName = new HBox(new Label("Last name:"));
    lastName.getChildren().add(inputLastName);

    // Add horizontal EMAIL box
    TextField emailInput = new TextField("");
    HBox email = new HBox(new Label("Email:"));
    email.getChildren().add(emailInput);

    // Add horizontal DATEOFBIRTH box
    TextField dateOfBirthInput = new TextField("");
    HBox dateOfBirth = new HBox(new Label("Date of birth:"));
    dateOfBirth.getChildren().add(dateOfBirthInput);

    // Add horizontal GENDER box
    TextField genderInput = new TextField("");
    HBox gender = new HBox(new Label("Gender:"));
    gender.getChildren().add(genderInput);

    // Add horizontal POSTALCODE box
    TextField postalCodeInput = new TextField("");
    HBox postalCode = new HBox(new Label("Enter your postalcode:"));
    postalCode.getChildren().add(postalCodeInput);

    // Add horizontal STREET box
    TextField inputStreet = new TextField("");
    HBox street = new HBox(new Label("Enter your street:"));
    street.getChildren().add(inputStreet);

    // Add horizontal HOUSENUMBER box
    TextField inputHouseNumber = new TextField("");
    HBox houseNumber = new HBox(new Label("Enter your house number:"));
    houseNumber.getChildren().add(inputHouseNumber);

    // Add horizontal CITY box
    TextField inputCity = new TextField("");
    HBox city = new HBox(new Label("Enter your city:"));
    city.getChildren().add(inputCity);

    // Add horizontal COUNTRY box
    TextField inputCountry = new TextField("");
    HBox country = new HBox(new Label("Enter your country:"));
    country.getChildren().add(inputCountry);

    // 2.1 add to parent node ADD TO CREATE STUDENT FORM
    createStudentForm.getChildren().addAll(firstName, lastName, email, dateOfBirth, gender, postalCode, street,
        houseNumber, city, country);

    // LAST set scene to create student AS STANDARD
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
