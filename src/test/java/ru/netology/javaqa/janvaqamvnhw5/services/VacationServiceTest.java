package ru.netology.javaqa.janvaqamvnhw5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files="src/test/resources/monthsVacation.csv")
    public void shouldCalculateFormMonthsVacations(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        //int expected = 3;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

//  @Test
//    public void shouldCalculateFormMonthsVacations100k() {
//        VacationService service = new VacationService();
//
//        int expected = 2;
//        // вызываем целевой метод:
//        int actual = service.calculate(100_000, 60_000, 150_000);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
}