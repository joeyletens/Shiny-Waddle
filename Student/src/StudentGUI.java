import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StudentGUI extends Application {

  @Override
  public void start(Stage window) {
    // Create vertial box to add all horizontal boxes
    BorderPane layout = new BorderPane();
    // borderpane styling
    Label title = new Label("Enter your student details below");
    title.setFont(new Font("Arial", 26));
    layout.setTop(title);

    VBox inputForm = new VBox();
    inputForm.setSpacing(30);

    //
    // Add horizontal NAME box
    //
    TextField inputName = new TextField("");
    HBox name = new HBox();
    name.getChildren().add(new Label("Enter your name:"));
    name.getChildren().add(inputName);
    // add to parent node
    inputForm.getChildren().add(name);

    //
    // Add horizontal EMAIL box
    //
    TextField emailInput = new TextField("");
    Label emailError = new Label("");
    HBox email = new HBox();
    email.getChildren().add(new Label("Enter your email:"));
    email.getChildren().add(emailInput);
    email.getChildren().add(emailError);
    // input validation
    emailInput.textProperty().addListener((change, oldValue, newValue) -> {
      emailError.setText(InputValidation.emailValidation(newValue));
    });

    // add to parent node
    inputForm.getChildren().add(email);

    //
    // Add horizontal POSTALCODE box
    //
    TextField postalCodeInput = new TextField("");
    Label postalCodeError = new Label("");
    HBox postalCode = new HBox();
    postalCode.getChildren().add(new Label("Enter your postalcode:"));
    postalCode.getChildren().add(postalCodeInput);
    postalCode.getChildren().add(postalCodeError);
    // input validation
    postalCodeInput.textProperty().addListener((change, oldValue, newValue) -> {
      postalCodeError.setText(InputValidation.postalCodeValidation(newValue));
    });
    // add to parent node
    inputForm.getChildren().add(postalCode);

    //
    // Add horizontal GENDER box
    //
    HBox genderInfo = new HBox(new Label("male(M), female(F), other(O)"));
    TextField genderInput = new TextField("");
    Label genderError = new Label("");
    HBox gender = new HBox();
    gender.getChildren().add(new Label("Enter your gender:"));
    gender.getChildren().add(genderInput);
    gender.getChildren().add(genderError);
    // input validation
    genderInput.textProperty().addListener((change, oldValue, newValue) -> {
      genderError.setText(InputValidation.genderValidation(newValue));
    });
    // add to parent node
    inputForm.getChildren().add(genderInfo);
    inputForm.getChildren().add(gender);

    //
    // Add horizontal DATEOFBIRTH box
    //
    HBox dateOfBirthInfo = new HBox(new Label("dd-mm-yyyy"));
    TextField dateOfBirthInput = new TextField("");
    Label dateOfBirthError = new Label("");
    HBox dateOfBirth = new HBox();
    dateOfBirth.getChildren().add(new Label("Enter your date of birth:"));
    dateOfBirth.getChildren().add(dateOfBirthInput);
    dateOfBirth.getChildren().add(dateOfBirthError);
    // input validation
    dateOfBirthInput.textProperty().addListener((change, oldValue, newValue) -> {
      dateOfBirthError.setText(InputValidation.dateOfBirthValidation(newValue));
    });
    // add to parent node
    inputForm.getChildren().add(dateOfBirthInfo);
    inputForm.getChildren().add(dateOfBirth);

    // set scene
    layout.setCenter(inputForm);
    Scene view = new Scene(layout);

    // Start application
    window.setTitle("Het werkt, ik vertrouw het niet.");
    window.setScene(view); // Set the scene
    window.show();
  }

  public static void main(String[] args) {
    launch(StudentGUI.class);
  }

}
