import java.util.regex.Pattern;

public class RegexEmail {
//    String arr[] ={"abc@yahoo.com", "abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au"
//            + "abc.100@abc.com.au", "abc@1.com" , " abc@gmail.com.com", "abc+100@gmail.com"};
//        for(int i = 0; i<arr.length;i++) {
//
//
//        boolean result8 = Pattern.matches("[0-9]*(?=.*[@#$%^&+=.]).{8,}", arr[i]);
//        System.out.println("Email "+ arr[i] + " Result :" + result8);
//}

    public boolean getEmailCheck(String email) {
        boolean result8 = Pattern.matches("[0-9]*(?=.*[@#$%^&+=.]).{8,}",email);
        return result8;
    }
    }
