package ua.step.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задание: Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все оди-
 * наковы и No – если имеется хоть одно различие.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean equal = true;
        for (int i = 0; i < arr.length; i++) {
            if (!equal) {
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println(equal ? "Yes" : "No");
    }
}
