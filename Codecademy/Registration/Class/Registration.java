package Registration.Class;

import Course.Class.Course;
import Student.Class.Student;

public class Registration {
  String email;
  int courseId;
  String date;

  public Registration(String email, int courseId, String date) {
    this.email = email;
    this.courseId = courseId;
    this.date = date;
  }
}
