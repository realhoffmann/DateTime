package TimeDateTests;

import at.technikum.datetime.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.LocalTime;

public class TDTests {
    @Test
    public void date(){
        DateTime DT = new DateTime();
        LocalDate actual = DT.date();
        LocalDate expected = LocalDate.now();
        Assertions.assertEquals(expected.getYear(), actual.getYear(), "should be 2022");
    }

    @Test
    public void time(){
        DateTime DT = new DateTime();
        LocalTime actual = DT.time();
        LocalTime expected = LocalTime.now();
        Assertions.assertEquals(expected, actual, "should be current time");

    }
}

