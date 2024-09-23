package org.example;


import java.util.Scanner;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        start(scanner);


    }

    public static void start(Scanner scanner) {



        System.out.println("Выберите операцию:");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");

        int choice = scanner.nextInt();

        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();
        Calculator calculator = new Calculator(a, b);
        
        double result = 0;

        switch (choice) {
            case 1:
                result = calculator.sum(a, b);
                break;
            case 2:
                result = calculator.sub(a, b);
                break;
            case 3:
                result = calculator.mul(a, b);
                break;
            case 4:
                result = calculator.div(a, b);
                break;
            default:
                System.out.println("Неправильный ввод.");
                start(scanner);
                
         
                
        }
        scanner.nextLine();
        System.out.println("Результат: " + result);

    }
}

