package Student.GUI;

import Student.Database.CRUDStudent;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

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
    Button changeStudentButton = new Button("Change");
    Button deleteStudentButton = new Button("Delete");
    Label emailLabel = new Label("Email:");

    // 1.3 Add buttons to menu
    menu.getChildren().addAll(studentLabel, createStudentButton, readStudentButton, changeStudentButton,
        deleteStudentButton);
    mainLayout.setTop(menu);

    // 2. Create CREATE STUDENT subview layout
    VBox createStudentView = new VBox(new Label("Enter new student's details below"));
    createStudentView.setSpacing(30);
    Button addStudent = new Button("add student");

    // 3. Create READ STUDENT subview layout
    VBox readStudentView = new VBox(new Label("Enter student's email which you would like to read more about"));
    readStudentView.setSpacing(30);

    // 4. Create CHANGE STUDENT subview layout
    VBox changeStudentView = new VBox(new Label("Enter student's email which you would like to change"));
    changeStudentView.setSpacing(30);

    // 5. Create READ STUDENT subview layout
    VBox deleteStudentView = new VBox(new Label("Enter student's email which you would like to delete"));
    deleteStudentView.setSpacing(30);

    // 2. Add horizontal FIRSTNAME box
    TextField inputFirstName = new TextField("");
    HBox firstName = new HBox(new Label("First name:"));
    firstName.getChildren().add(inputFirstName);

    // 2. Add horizontal LASTNAME box
    TextField inputLastName = new TextField("");
    HBox lastName = new HBox(new Label("Last name:"));
    lastName.getChildren().add(inputLastName);

    // 2. Add horizontal EMAIL box
    TextField emailInput = new TextField("");
    HBox email = new HBox(emailLabel);
    email.getChildren().add(emailInput);

    // 2. Add horizontal DATEOFBIRTH box
    TextField dateOfBirthInput = new TextField("");
    HBox dateOfBirth = new HBox(new Label("Date of birth:"));
    dateOfBirth.getChildren().add(dateOfBirthInput);

    // 2. Add horizontal GENDER box
    TextField genderInput = new TextField("");
    HBox gender = new HBox(new Label("Gender:"));
    gender.getChildren().add(genderInput);

    // 2. Add horizontal POSTALCODE box
    TextField postalCodeInput = new TextField("");
    HBox postalCode = new HBox(new Label("Enter your postalcode:"));
    postalCode.getChildren().add(postalCodeInput);

    // 2. Add horizontal STREET box
    TextField inputStreet = new TextField("");
    HBox street = new HBox(new Label("Enter your street:"));
    street.getChildren().add(inputStreet);

    // 2. Add horizontal HOUSENUMBER box
    TextField inputHouseNumber = new TextField("");
    HBox houseNumber = new HBox(new Label("Enter your house number:"));
    houseNumber.getChildren().add(inputHouseNumber);

    // 2. Add horizontal CITY box
    TextField inputCity = new TextField("");
    HBox city = new HBox(new Label("Enter your city:"));
    city.getChildren().add(inputCity);

    // 2. Add horizontal COUNTRY box
    TextField inputCountry = new TextField("");
    HBox country = new HBox(new Label("Enter your country:"));
    country.getChildren().add(inputCountry);

    // 4 add label to CHANGE STUDENT
    Label changeText = new Label("Fill in the textfields which you would like to change");
    // Add horizontal EMAIL box
    TextField emailInputChange = new TextField("");
    HBox emailChange = new HBox(emailLabel);
    emailChange.getChildren().add(emailInputChange);

    // 3. Add horizontal READ EMAIL box
    TextField emailInputRead = new TextField("");
    HBox emailRead = new HBox(emailLabel);
    emailRead.getChildren().add(emailInputRead);

    // 5. Add horizontal READ EMAIL box
    TextField emailInputDelete = new TextField("");
    HBox emailDelete = new HBox(emailLabel);
    emailDelete.getChildren().add(emailInputDelete);

    // 2.1 add to parent node ADD TO CREATE STUDENT FORM
    createStudentView.getChildren().addAll(firstName, lastName, email, dateOfBirth, gender, postalCode, street,
        houseNumber, city, country, addStudent);

    // // 3.1 add to parent node ADD TO READ STUDENT FORM
    // readStudentView.getChildren().add(emailRead);

    // // // 4.1 add to parent node ADD TO CHANGE STUDENT FORM
    // // changeStudentView.getChildren().addAll(emailChange, changeText, firstName,
    // // lastName, email, dateOfBirth, gender,
    // // postalCode, street, houseNumber, city, country);

    // // 5.1 add to parent node ADD TO DELETE STUDENT FORM
    // deleteStudentView.getChildren().add(emailDelete);

    // 6.1 add subview buttons
    createStudentButton.setOnAction((event) -> mainLayout.setCenter(createStudentView));
    readStudentButton.setOnAction((event) -> mainLayout.setCenter(readStudentView));
    changeStudentButton.setOnAction((event) -> mainLayout.setCenter(changeStudentView));
    deleteStudentButton.setOnAction((event) -> mainLayout.setCenter(deleteStudentView));

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
    CRUDStudent.CreateStudent("jletfefeefefefef@gmail.com", "Joey", "Letens", "15/04/2002", "male", "Draaiboom", "105",
        "4433wp");
    launch(GUIStudent.class);
  }

}
