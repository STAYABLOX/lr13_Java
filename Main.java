package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello George!");


        Tester tester = new Tester("Иван", "Петров", 5, "Intermediate", 70000.0);


        System.out.println(tester.getInfo()); // Краткая информация
        System.out.println(tester.getInfo(true)); // Полная информация
        System.out.println(tester.getInfo(true, 2)); // Полная информация с бонусным стажем

        // Вызов статического метода
        double bonus = Tester.calculateBonus(tester.getSalary(), 10);
        System.out.println("Бонус: " + bonus);

        // Вывод объекта
        System.out.println(tester);
    }
}