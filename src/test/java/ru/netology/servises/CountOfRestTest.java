package ru.netology.servises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CountOfRestTest {

    @Test
    void shouldCalculateCountOfRest1() {
        CountOfRest service = new CountOfRest();

        // подготавливаем данные
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateCountOfRest2() {
        CountOfRest service = new CountOfRest();

        // подготавливаем данные
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}