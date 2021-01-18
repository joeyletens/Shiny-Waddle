package Student.GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
    Button createStudentButton = new Button("Add");
    Button readStudentButton = new Button("Read");
    Button updateStudentButton = new Button("Update");
    Button deleteStudentButton = new Button("Delete");

    // 1.3 Add buttons to menu
    menu.getChildren().addAll(studentLabel, createStudentButton, readStudentButton, updateStudentButton, deleteStudentButton);
    mainLayout.setTop(menu);

    // 2. Create CREATE STUDENT subview layout
    VBox createStudentView = new VBox(new Label("Enter new student's details below"));
    createStudentView.setSpacing(30);

    // 3. Create READ STUDENT subview layout
    VBox readStudentView = new VBox(new Label("Enter student's email which you would like to read more about"));
    readStudentView.setSpacing(30);

    // 4. Create UPDATE STUDENT subview layout
    VBox updateStudentView = new VBox(new Label("Enter student's email which you would like to update"));
    updateStudentView.setSpacing(30);

    // 5. Create READ STUDENT subview layout
    VBox deleteStudentView = new VBox(new Label("Enter student's email which you would like to delete"));
    deleteStudentView.setSpacing(30);

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

    // 4 add label to UPDATE STUDENT 
    Label updateText = new Label("Fill in the textfields which you would like to update")

    // 2.1 add to parent node ADD TO CREATE STUDENT FORM
    createStudentView.getChildren().addAll(firstName, lastName, email, dateOfBirth, gender, postalCode, street,
        houseNumber, city, country);

    // 3.1 add to parent node ADD TO READ STUDENT FORM
    readStudentView.getChildren().addAll(email);

    // 4.1 add to parent node ADD TO UPDATE STUDENT FORM
    updateStudentView.getChildren().addAll(email, updateText, firstName, lastName, email, dateOfBirth, gender,
        postalCode, street, houseNumber, city, country);

    // 5.1 add to parent node ADD TO DELETE STUDENT FORM
    deleteStudentView.getChildren().addAll(email);

    // 6. set scene to create student AS STANDARD
    mainLayout.setCenter(createStudentView);
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
