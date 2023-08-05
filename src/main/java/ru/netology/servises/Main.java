package ru.netology.servises;

public class Main {
    public static void main(String[] args) {
        CountOfRest service = new CountOfRest();
        int count = service.calculate(100_000, 60_000, 150_000);
        System.out.println(count);
    }
}