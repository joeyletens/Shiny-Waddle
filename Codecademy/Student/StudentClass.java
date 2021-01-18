package Student;

public class StudentClass {
  String email;
  String firstName;
  String lastName;
  String dateOfBirth;
  String gender;
  String street;
  String houseNumber;
  String postalCode;
  String city;
  String country;

  public StudentClass(String email, String firstName, String lastName, String dateOfBirth, String gender, String street,
      String houseNumber, String postalCode, String city, String country) {
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.street = street;
    this.houseNumber = houseNumber;
    this.postalCode = postalCode;
    this.city = city;
    this.country = country;
  }

}
