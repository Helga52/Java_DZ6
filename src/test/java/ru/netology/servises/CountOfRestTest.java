package ru.netology.servises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CountOfRestTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/countofrest.csv")
    void shouldCalculateCountOfRest(int expected, int income, int expenses, int threshold) {
        CountOfRest service = new CountOfRest();

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}