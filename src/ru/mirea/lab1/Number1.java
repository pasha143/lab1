package ru.mirea.lab1;
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите величину массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;

        System.out.println("Введите числа:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];

        }
        double avg = (double) sum/size;
        System.out.println("Сумма чисел - " + sum);
        System.out.println("Среднее арифмитическое - " + avg);
    }
}