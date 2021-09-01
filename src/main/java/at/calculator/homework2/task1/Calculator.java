package at.calculator.homework2.task1;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.startCalculator();  //Зачем так делать?
    }

    public Calculator() {
    }

    public void startCalculator() {


        Scanner keyScanner = new Scanner(System.in);

        System.out.println("Введите 1-е целое число");
        int digit1 = keyScanner.nextInt();

        System.out.println("Введите 2-е целое число");
        int digit2 = keyScanner.nextInt();

        System.out.println("Введите один из 4х символов + - * / ");
        char symbol = keyScanner.next().charAt(0);


        int result;
        switch (symbol) {
            case '+':
                result = digit1 + digit2;
                System.out.print("Result = " + result);
                break;

            case '-' :
                result = digit1 - digit2;
                System.out.println("Result = " + result);
                break;

            case '*' :
                result = digit1 * digit2;
                System.out.println("Result = " + result);
                break;

            case '/' :
                if (digit2 != 0) {
                    result = digit1 / digit2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: divide by zero");
                }
                break;
            default:
                System.out.println("Ошибка, исправте и повторите ввод");

        }

    }
}
