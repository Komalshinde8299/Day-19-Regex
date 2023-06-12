import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestRegexEmail {
    private String email;
    private boolean expectedResult;
    private RegexEmail regexEmail;

    @Before
    public void initilize(){
        regexEmail = new RegexEmail();
    }

    public TestRegexEmail(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection checkEmail(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true}, {"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},{"abc-100@abc.net",true}, {"abc.100@abc.com.au",true},
                { "abc.100@abc.com.au",true}, {"abc@1.com" ,true},{ " abc@gmail.com.com", true},{ "abc+100@gmail.com",true}});

    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnParameterizedResults() {
        boolean result = regexEmail.getEmailCheck(email);
        Assert.assertEquals(expectedResult, result);
    }
}
