package ru.mirea.lab1;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите величину массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;

        System.out.println("Введите числа:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum=sum+array[i];
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Максимальное число - " + max);
        System.out.println("Минимальное число - " + min);
        System.out.println("Сумма чисел - " + sum);
    }
}
