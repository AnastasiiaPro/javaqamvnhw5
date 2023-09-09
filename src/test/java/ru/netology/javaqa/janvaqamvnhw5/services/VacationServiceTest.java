package ru.netology.javaqa.janvaqamvnhw5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    public void shouldCalculateFormMonthsVacations() {
        VacationService service = new VacationService();

        int expected = 3;
        // вызываем целевой метод:
        int actual = service.calculate(10_000, 3_000, 20_000);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateFormMonthsVacations100k() {
        VacationService service = new VacationService();

        int expected = 2;
        // вызываем целевой метод:
        int actual = service.calculate(100_000, 60_000, 150_000);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}