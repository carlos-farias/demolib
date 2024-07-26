package com.example;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class LifeExpectancyCalculatorTest {
    @Test
    public void testCalculateDaysLeft() {
        LifeExpectancyCalculator calculator = new LifeExpectancyCalculator();
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        LocalDate expectedEndDate = birthDate.plusYears(100);
        long expectedDaysLeft = expectedEndDate.toEpochDay() - LocalDate.now().toEpochDay();
        assertEquals(expectedDaysLeft, calculator.calculateDaysLeft(birthDate));
    }
}
