import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {


    @Test
    void isPositiveTest(String s) {

        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPositive("-12"));


    }
}

