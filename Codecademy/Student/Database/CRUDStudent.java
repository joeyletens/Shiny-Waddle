package Student.Database;

import java.sql.*;

public class CRUDStudent {

  public static void database(String email, String firstName, String lastName, String dateOfBirth, String gender,
      String street, String houseNumber, String postalCode) {

    // Dit zijn de instellingen voor de verbinding. Vervang de databaseName indien
    // deze voor jou anders is.
    String connectionUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=Codecademy;integratedSecurity=true;";

    // Connection beheert informatie over de connectie met de database.
    Connection con = null;

    // Statement zorgt dat we een SQL query kunnen uitvoeren.
    Statement stmt = null;

    // ResultSet is de tabel die we van de database terugkrijgen.
    // We kunnen door de rows heen stappen en iedere kolom lezen.
    ResultSet rs = null;

    try {
      // 'Importeer' de driver die je gedownload hebt.
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      // Maak de verbinding met de database.
      con = DriverManager.getConnection(connectionUrl);

      // Stel een SQL query samen.
      String SQL = "INSERT INTO Students VALUES('" + email + "','" + firstName + "','" + lastName + "'," + dateOfBirth
          + ",'" + gender + "','" + street + "','" + houseNumber + "','" + postalCode
          + "', 'breda', 'netherlands') SELECT TOP 10 * FROM Students";
      stmt = con.createStatement();
      // Voer de query uit op de database.
      // , , , , , , , , ,
      rs = stmt.executeQuery(SQL);

      System.out.print(String.format("| %20s | %-32s | %-24s |\n", " ", " ", " ").replace(" ", "-"));

      // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen
      // ze.
      while (rs.next()) {
        // Vraag per row de kolommen in die row op.
        String mail = rs.getString("Email");
        String naam = rs.getString("FirstName");
        String land = rs.getString("Country");

        // Met 'format' kun je de string die je print het juiste formaat geven, als je
        // dat wilt.
        // %d = decimal, %s = string, %-32s = string, links uitgelijnd, 32 characters
        // breed.
        System.out.format("| %20s | %-32s | %-24s | \n", mail, naam, land);
      }
      System.out.println(String.format("| %20s | %-32s | %-24s |\n", " ", " ", " ").replace(" ", "-"));

    }

    // Handle any errors that may have occurred.
    catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (rs != null)
        try {
          rs.close();
        } catch (Exception e) {
        }
      if (stmt != null)
        try {
          stmt.close();
        } catch (Exception e) {
        }
      if (con != null)
        try {
          con.close();
        } catch (Exception e) {
        }
    }
  }
}