
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TestClass {

    @Test
    public void givenfirstName_when_valid_returnTrue(){
    RegexProblems regexProblems = new RegexProblems();
    boolean actualResult = regexProblems.getFirstName("Komal");
        Assertions.assertEquals(true,actualResult);
    }
    @Test
    public void givenlastName_when_valid_returnTrue(){
        RegexProblems regexProblems = new RegexProblems();
        boolean actualResult = regexProblems.getLastName("Shinde");
        Assertions.assertEquals(true,actualResult);
    }
    @Test
    public void givenEmail_when_valid_returnTrue(){
        RegexProblems regexProblems = new RegexProblems();
        boolean actualResult = regexProblems.getEmail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,actualResult);
    }
    @Test
    public void givenMobNo_when_valid_returnTrue(){
        RegexProblems regexProblems = new RegexProblems();
        boolean actualResult = regexProblems.getMobNo("91 7057757826");
        Assertions.assertEquals(true,actualResult);
    }
    @Test
    public void givenPassword_when_valid_returnTrue(){
        RegexProblems regexProblems = new RegexProblems();
        boolean actualResult = regexProblems.getPassword("KomalShinde82@");
        Assertions.assertEquals(true,actualResult);
    }
    @Test
    public void testGivenFirstName_Invalid_ReturnsFalse() {
        RegexProblems regexProblems = new RegexProblems();
        boolean actualResult = regexProblems.getFirstName("k");
        Assertions.assertFalse(actualResult);
    }

    @Test
    public void testGivenLastName_Invalid_ReturnsFalse() {
        RegexProblems regexProblems = new RegexProblems();
        boolean actualResult = regexProblems.getLastName("s");
        Assertions.assertFalse(actualResult);
    }

    @Test
    public void testGivenEmail_Invalid_ReturnsFalse() {
        RegexProblems regexProblems = new RegexProblems();
        boolean actualResult = regexProblems.getEmail("abc.xyz");
        Assertions.assertFalse(actualResult);
    }

    @Test
    public void testGivenMobNo_Invalid_ReturnsFalse() {
        RegexProblems regexProblems = new RegexProblems();
        boolean actualResult = regexProblems.getMobNo("12345");
        Assertions.assertFalse(actualResult);
    }

    @Test
    public void testGivenPassword_Invalid_ReturnsFalse() {
        RegexProblems regexProblems = new RegexProblems();
        boolean actualResult = regexProblems.getPassword("password");
        Assertions.assertFalse(actualResult);
    }



}
