import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PasswordValidatorTest {
    PasswordValidator passwordValidator;

    @Before
    public void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void shouldReturnFalseWhenPasswordIsEmpty() {
        boolean result = passwordValidator.isValid("");

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenThereIsSpace() {
        boolean result = passwordValidator.isValid("Hi Cat12@");

        assertFalse(result);
    }

    @Test
    public void returnFalseIfNoCapitalLetter() {
        boolean result = passwordValidator.isValid("hicat12@");

        assertFalse(result);
    }

    @Test
    public void returnFalseIfNoNumber() {
        boolean result = passwordValidator.isValid("HiCatWoman@");

        assertFalse(result);
    }

    @Test
    public void returnFalseIfNoSmallLetter() {
        boolean result = passwordValidator.isValid("HICAT12@");

        assertFalse(result);
    }

    @Test
    public void returnFalseIfNoSpecialCharacter() {
        boolean result = passwordValidator.isValid("HiCat123");

        assertFalse(result);
    }

    @Test
    public void returnFalseWhenLengthLessThanEight() {
        boolean result = passwordValidator.isValid("HiCat1@");

        assertFalse(result);
    }

    @Test
    public void returnFalseWhenLengthMoreThanFifteen() {
        boolean result = passwordValidator.isValid("WaterHouseSimon23*&");

        assertFalse(result);
    }

    @Test
    public void returnTrueWhenItSatisfiesAllAboveCondition() {
        boolean result = passwordValidator.isValid("Baby123@");

        assertTrue(result);
    }
}
