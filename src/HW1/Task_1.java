package HW1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        task3();
        task1();
        task1_2();
        task2();
    }

    //Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    static void task1() { // первый способ реализации
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scan.nextInt();

        System.out.println((n * (n + 1)) / 2);
    }

    //n! (произведение чисел от 1 до n)
    static void task1_2() {
        int num = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n1 = scan.nextInt();
        for (int i = n1; i > 0; i--) {
            num = num * i;
        }
        System.out.println(num);
    }

    //Вывести все простые числа от 1 до 1000
    static void task2() {
        boolean primeNum;
        for (int i = 1; i < 1000; i++) {
            primeNum = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primeNum = false;
                    break;
                }
            }


            if (primeNum) {
                System.out.print(i + ", ");
            }
        }

    }

    static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        System.out.println("Введите знак действия: ");
        char mathActionSing;
        mathActionSing = scan.next().charAt(0);
        switch (mathActionSing) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Неизвестный знак действия");

        }

    }
}
