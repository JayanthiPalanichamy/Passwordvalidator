import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static final String PASSWORD_VALIDATION_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,15}$";

    public boolean isValid(String password) {

        if (password.length() == 0) {
            return false;
        } else {
            Pattern pattern = Pattern.compile(PASSWORD_VALIDATION_REGEX);
            Matcher matcher = pattern.matcher(password);
            return matcher.find();
        }
    }
}
