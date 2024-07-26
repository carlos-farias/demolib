package com.example;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class AgeCalculatorTest {
    @Test
    public void testCalculateAgeInDays() {
        AgeCalculator calculator = new AgeCalculator();
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        long expectedDays = LocalDate.now().toEpochDay() - birthDate.toEpochDay();
        assertEquals(expectedDays, calculator.calculateAgeInDays(birthDate));
    }
}
