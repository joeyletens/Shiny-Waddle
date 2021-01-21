package Student.Database;

import java.sql.*;

public class CRUDStudent {

  public static String databaseUrl() {
    return "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=Codecademy;integratedSecurity=true;";
  }

  public static void CreateStudent(String email, String firstName, String lastName, String dateOfBirth, String gender,
      String street, String houseNumber, String postalCode) {

    try {
      // Get connection to database
      Connection connectionUrl = DriverManager.getConnection(databaseUrl());

      // Create a statement
      Statement stmt = connectionUrl.createStatement();

      // 'Importeer' de driver die je gedownload hebt.
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

      // Stel een SQL query samen.
      String SQL = "INSERT INTO Students VALUES('" + email + "','" + firstName + "','" + lastName + "'," + dateOfBirth
          + ",'" + gender + "','" + street + "','" + houseNumber + "','" + postalCode
          + "', 'breda', 'netherlands') SELECT TOP 10 * FROM Students";

      stmt.executeQuery(SQL);
    }
    // Handle any errors that may have occurred.
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void UpdateStudentEmail(String email, String newEmail) {

    try {
      // Get connection to database
      Connection connectionUrl = DriverManager.getConnection(databaseUrl());

      // Create a statement
      Statement stmt = connectionUrl.createStatement();

      // 'Importeer' de driver die je gedownload hebt.
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

      // Stel een SQL query samen.
      String SQL = "UPDATE Students SET email='"+ newEmail + "' WHERE email='"+ email + "'";

      stmt.executeQuery(SQL);
    }
    // Handle any errors that may have occurred.
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void UpdateStudentEmail(String email, String newEmail) {

    try { 

      // 'Importeer' de driver die je gedownload hebt.
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

      // Stel een SQL query samen.
      String SQL = "UPDATE Students SET email='"+ newEmail + "' WHERE email='"+ email + "'";

      DriverManager.getConnection(databaseUrl()).createStatement().executeQuery(SQL);
    }
    // Handle any errors that may have occurred.
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}