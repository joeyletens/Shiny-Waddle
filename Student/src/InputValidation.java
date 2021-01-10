import java.time.format.DateTimeFormatter;

public class InputValidation {
  static String emailValidation(String email) {
    String regex = "^(.+)@(.+)$";

    if (email.matches(regex)) {
      return "email is valid";
    } else {
      return "email is invalid";
    }
  }

  static String postalCodeValidation(String postalCode) {
    String regex = " *[1-9][0-9]{3} ?(?!sa|sd|ss)[a-z]{2} *";
    if (postalCode.toLowerCase().matches(regex)) {
      return "postalcode is valid";
    } else {
      return "postalcode is invalid";
    }
  }

  static String genderValidation(String gender) {
    String regex = " *(m|f|o) *";
    if (gender.toLowerCase().matches(regex)) {
      return "gender is valid";
    } else {
      return "gender is invalid";
    }
  }

  static String dateOfBirthValidation(String dateOfBirth) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    formatter.parse(dateOfBirth);
    return "date of birth is invalid";
    return "date of birth is valid";
  }
}
