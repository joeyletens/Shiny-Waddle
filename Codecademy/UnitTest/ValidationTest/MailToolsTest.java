package UnitTest.ValidationTest;

import org.junit.Test;

import UnitTest.ValidationMethods.MailTools;

public class MailToolsTest {
  /**
   * @subcontract no mailbox part {
   * @requires !mailAddress.contains("@") || mailAddress.split("@")[0].length < 1;
   * @ensures \result = false; }
   */
  @Test
  public void testValidateMailAddressRequiresOneAtCharacterEnsuresFalse() {
    // Arrange
    String mailAddress = "fakeemail@gmail.com";

    // Act
    String result = MailTools.validateMailAddress(mailAddress);

    // Assert
    assertEquals(false, result);
  }

  @Test
  public void testValidateMailAddressRequiresAtCharacterAsSecondEnsuresFalse() {
    // Arrange
    String mailAddress = "f@akeemailgmail.com";

    // Act
    String result = MailTools.validateMailAddress(mailAddress);

    // Assert
    assertEquals(false, result);
  }

  /**
   * @subcontract subdomain-tld delimiter {
   * @requires !mailAddress.contains("@") ||
   *           mailAddress.split("@")[1].split(".").length > 2;
   * @ensures \result = false; }
   */
  @Test
  public void testValidateMailAddressRequiresTwoDotsEnsuresFalse() {
    // Arrange
    String mailAddress = "fakeemail@gm.ail.com";

    // Act
    String result = MailTools.validateMailAddress(mailAddress);

    // Assert
    assertEquals(false, result);
  }

  /**
   * @subcontract no subdomain part {
   * @requires !mailAddress.contains("@") ||
   *           mailAddress.split("@")[1].split(".")[0].length < 1;
   * @ensures \result = false; }
   */
  @Test
  public void testValidateMailAddressRequiresOneCharacterBetweenAtAndDotEnsuresFalse() {
    // Arrange
    String mailAddress = "renzeremmers@g.com";

    // Act
    String result = MailTools.validateMailAddress(mailAddress);
    // Assert
    assertEquals(false, result);
  }

  /**
   * @subcontract no tld part {
   * @requires !mailAddress.contains("@") ||
   *           mailAddress.split("@")[1].split(".")[1].length < 1;
   * @ensures \result = false; }
   */
  @Test
  public void testValidationMailAddressRequiresOneCharacterAfterDotEnsuresFalse() {
    // Arrange
    String mailAddress = "renzoremmers@gmail.c";

    // Act
    String result = MailTools.validateMailAddress(mailAddress);

    // Assert
    assertEquals(false, result);
  }

  /**
   * @subcontract valid email {
   * @requires no other precondition
   * @ensures \result = true; }
   * 
   */
  @Test
  public void testValidationMailAddressRequiresNoOtherPreconditionEnsuresTrue() {
    // Arrange
    String mailAddress = "RenzoRemmers@gmail.com";

    // Act
    String result = MailTools.validateMailAddress(mailAddress);

    // Assert
    assertEquals(true, result);
  }
}
