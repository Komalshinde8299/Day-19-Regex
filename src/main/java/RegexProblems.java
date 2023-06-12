import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblems {

    public boolean getFirstName(String firstName){
        Pattern p = Pattern.compile("^[A-Z][a-z]{3,}" );
        Matcher m = p.matcher(firstName);
        boolean result = m.matches();

        return result;
    }

    public boolean getLastName(String lastName){
        boolean result1 = Pattern.matches("^[A-Z][a-z]{3,}", lastName);
        return result1;
    }


    public boolean getEmail(String mail) {
        boolean result2 = Pattern.matches("[a-z]{3,}[.][a-z]{3,}?@[a-z]{2,}[.][a-z]{2,}[.][a-z]{2,}?", mail);
        System.out.println(result2);
        return result2;
    }

    public boolean getMobNo(String mobNo) {
        boolean result3 = Pattern.matches("^(91)[ ][1-9][0-9]{9}", mobNo);
        return result3;
    }

    public boolean getPassword(String password) {
        boolean result7 = Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}", password);
        return result7;
    }
}
