package com.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LifeExpectancyCalculator {
    private static final int LIFE_EXPECTANCY_YEARS = 100;

    public long calculateDaysLeft(LocalDate birthDate) {
        LocalDate expectedEndDate = birthDate.plusYears(LIFE_EXPECTANCY_YEARS);
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.DAYS.between(currentDate, expectedEndDate);
    }
}
