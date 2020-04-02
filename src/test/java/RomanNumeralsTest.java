import RomanNumerals.NumeralsTraslator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RomanNumeralsTest {

    NumeralsTraslator traslator;

    @Before
    public void setUp() throws Exception {
        traslator = new NumeralsTraslator();
    }

    @Test
    @Parameters({
            "1,I",
            "2,II",
            "3,III",
            "5,V",
            "7,VII",
            "10,X",
            "18,XVIII",
            "30,XXX",
            "4,IV",
            "9,IX",
            "294,CCXCIV",
            "2019,MMXIX"
    })
    public void translate_arabNumber_to_romanNumerals(int number, String numeral){
        String actualNumeral = traslator.translateToNumerals(number);
    assertEquals(numeral, actualNumeral);
    }
}

