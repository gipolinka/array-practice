package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Есть массив размером n элементов и заполненный
 * случайными числами в диапазоне от 0 до 100.
 * Необходимо разделить этот массив на массивы меньшего
 * размера в каждом из которых будет находиться не менее m элементов из
 * большого массива.
 * Значения n и m вводятся с клавиатуры пользователем.
 * Вывести на экран исходный массив и разделенный массив.
 * <p>
 * Пример вывода:
 * <p>
 * Исходный массив [35, 80, 39, 79, 63, 32, 89, 22, 29, 29]
 * Результат
 * [35, 80, 39]
 * [79, 63, 32]
 * [89, 22, 29]
 * [29]
 */
public class Task11 {

    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest09
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массивов через пробел: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr;
        // TODO: Пишите код здесь
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(101);
        }
        System.out.println("Исходный массив " + Arrays.toString(arr));
        int size = (n % m == 0) ? n / m : n / m + 1;
        int[][] arrSplit = new int[size][];
        int index = 0;
        while (index < size) {
            if (index != (size - 1)) {
                arrSplit[index] = Arrays.copyOfRange(arr, m * index, m * (index + 1));
            } else {
                arrSplit[index] = Arrays.copyOfRange(arr, m * index, arr.length );
            }
            index++;
        }
        System.out.println("Результат");
        for (int [] item:arrSplit
             ) {
            System.out.println(Arrays.toString(item));
        }
    }
}
