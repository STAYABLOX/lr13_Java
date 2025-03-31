package org.example;
public class Tester {
    private String name; // Имя
    private String surname; // Фамилия
    private int experienceInYears; // Опыт в годах
    private String englishLevel; // Уровень английского
    private double salary; // Зарплата

    // Конструкторы
    public Tester() {
        this("Unknown", "Unknown", 0, "Unknown", 0.0); // Вызов конструктора с параметрами
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Unknown", 0.0); // Вызов конструктора с дополнительными параметрами
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    // Перегруженные методы

    // Метод для отображения краткой информации
    public String getInfo() {
        return name + " " + surname;
    }

    // Перегруженный метод с деталями
    public String getInfo(boolean fullDetails) {
        if (fullDetails) {
            return name + " " + surname + ", English Level: " + englishLevel + ", Salary: " + salary;
        }
        return getInfo();
    }

    // Перегруженный метод с дополнительным параметром
    public String getInfo(boolean fullDetails, int bonusYears) {
        int adjustedExperience = experienceInYears + bonusYears;
        return fullDetails
                ? name + " " + surname + ", Experience: " + adjustedExperience + " years"
                : getInfo();
    }

    // Геттер для зарплаты
    public double getSalary() {
        return salary;
    }

    // Статический метод для вычисления бонуса
    public static double calculateBonus(double salary, double percent) {
        return salary * (percent / 100);
    }


    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experienceInYears=" + experienceInYears +
                ", englishLevel='" + englishLevel + '\'' +
                ", salary=" + salary +
                '}';
    }
}
