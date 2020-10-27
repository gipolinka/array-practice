package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая циф-
 * ра. Вывести результат на экран. n – задается с клавиатуры
 * <p>
 * Пример вывода:
 * 3 - 2 раза
 * 5 - 3 раза
 * 8 - 1 раза
 * 9 - 3 раза
 * 11 - 1 раза
 */
public class Task07 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest07
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        int[] arr;
        // TODO: Пишите код здесь
        arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(14 - 3) + 3;
        }
        int []arrCopy;
        arrCopy=Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        for (int i = 0; i < arrCopy.length; i++) {
            int num = 0;
            for (int j = 0; j < arrCopy.length; j++) {
                if (arrCopy[i] == arrCopy[j]) {
                    if (i > j) {
                        break;
                    }
                        num++;
                }
            }
            if (num > 0) {
                System.out.println(arrCopy[i] + " - " + num + " раза");
            }
        }
    }
}
