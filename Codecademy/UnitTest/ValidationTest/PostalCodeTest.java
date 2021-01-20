package UnitTest.ValidationTest;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

public class PostalCodeTest {
  /**
   * @subcontract null postalCode {
   * @requires postalCode == null;
   * @signals (NullPointerException) postalCode == null; }
   */

  @Test(expected = NullPointerException.class)
  public void testFormatPostalCodeRequiresNullSignalsNullPointerException() {
    // Arrange
    String postalCode = null;

    // Act
    String result = PostalCode.formatPostalCode(postalCode);

  }

  /**
   * @subcontract valid postalCode {
   * @requires Integer.valueOf(postalCode.trim().substring(0, 4)) > 999 &&
   *           Integer.valueOf(postalCode.trim().substring(0, 4)) <= 9999 &&
   *           postalCode.trim().substring(4).trim().length == 2 && 'A' <=
   *           postalCode.trim().substring(4).trim().toUpperCase().charAt(0) <=
   *           'Z' && 'A' <=
   *           postalCode.trim().substring(4).trim().toUpperCase().charAt(0) <=
   *           'Z';
   * @ensures \result = postalCode.trim().substring(0, 4) + " " +
   *          postalCode.trim().substring(4).trim().toUpperCase() }
   */

  @Test
  public void testFormatPostalCodeRequiresPostalCodeThousandEnsuresPostalCodeAboveThousand() {
    // Arrange
    String postalCode = "1000AA";

    // Act
    String result = PostalCode.formatPostalCode(postalCode);

    // Assert
    assertEquals("1000AA", result);
  }

  @Test
  public void testFormatPostalCodeRequiresPostalCodeTenThousandEnsuresPostalCodeBelowTenThousand() {
    // Arrange
    String postalCode = "9999 AA";

    // Act
    String result = PostalCode.formatPostalCode(postalCode);

    // Assert
    assertEquals("9999 AA", result);
  }

  @Test
  public void testFormatPostalCodeRequiresPostalCodeTwoLettersAtTheEndEnsuresPostalCodeHasTwoLettersAtTheEnd() {
    // Arrange
    String postalCode = "4200 AA";

    // Act
    String result = PostalCode.formatPostalCode(postalCode);

    // Assert
    assertEquals("4200 AA", result);
  }

  @Test
  public void testFormatPostalCodeRequiresLowerCaseLettersEnsuresPutLettersToUpperCase() {
    // Arrange
    String postalCode = "6969 az";

    // Act
    String result = PostalCode.formatPostalCode(postalCode);

    // Assert
    assertEquals("6969 AZ", result);
  }

  /**
   * @subcontract invalid postalCode {
   * @requires no other valid precondition;
   * @signals (IllegalArgumentException); }
   */

  @Test(expected = IllegalArgumentException.class)
  public void testFormatPostalCodeRequiresThreeNumbersAndTwoLettersEnsureIllegalArgumentException() {
    // Arrange
    String postalCode = "420 NS";

    // Act
    String result = PostalCode.formatPostalCode(postalCode);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFormatPostalCodeRequiresFiveNumbersAndTwoLettersEnsureIllegalArgumentException() {
    // Arrange
    String postalCode = "42069 NS";

    // Act
    String result = PostalCode.formatPostalCode(postalCode);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFormatPostalCodeRequiresFourNumbersAndOneLettersEnsureIllegalArgumentException() {
    // Arrange
    String postalCode = "4206 N";

    // Act
    String result = PostalCode.formatPostalCode(postalCode);

  }

  @Test(expected = IllegalArgumentException.class)
  public void testFormatPostalCodeRequiresFourNumbersAndThreeLettersEnsureIllegalArgumentException() {
    // Arrange
    String postalCode = "3200 BRO ";

    // Act
    String result = PostalCode.formatPostalCode(postalCode);
  }

}
