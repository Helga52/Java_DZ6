package ru.netology.servises;

public class CountOfRest {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int addexpenses = 0; // траты на отдых
        for (int month = 1; month < 13; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                addexpenses = (money - expenses) - (money - expenses) / 3;
                System.out.println("Месяц " + month + " Денег " + money + " Буду отдыхать. Потратил -" + expenses +
                        ", затем еще -" + addexpenses);
                money = money - expenses - addexpenses;
            } else {
                System.out.println("Месяц " + month + " Денег " + money + " Придется работать. Заработал +" +
                        +income + ", потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        return count;
    }
}