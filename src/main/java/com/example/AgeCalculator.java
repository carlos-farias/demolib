package com.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {
    public long calculateAgeInDays(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.DAYS.between(birthDate, currentDate);
    }
}
