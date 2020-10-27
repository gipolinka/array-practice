package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * Задание: Заполнить массив размерности n случайными строчны-
 * ми (маленькими) латинскими буквами. Подсчитать, сколько раз встреча-
 * ется каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 * g - 4 раза
 * l - 4 раза
 * s - 5 раз
 * v - 5 раз
 * x - 5 раз
 */
public class Task08 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest08
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        char[] arr;
        // TODO: Пишите код здесь
        arr=new char[len];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(char)(rnd.nextInt(123-97)+97);
        }
        char [] arrCopy;
        arrCopy=Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);
        //System.out.println(Arrays.toString(arrCopy));
        for (int i = 0; i <arrCopy.length ; i++) {
            int num=0;
            for (int j = 0; j <arrCopy.length ; j++) {
                if(arrCopy[i]==arrCopy[j])
                {
                    if(i>j)
                    {
                        break;
                    }
                    num++;
                }
            }
            if(num>3)
            {
                String times=((num%10==1||num%10==2||num%10==3||num%10==4)&&(num<10)||(num>20))?"раза":"раз";
                System.out.println(arrCopy[i]+" - "+num+" "+times);
            }
        }
    }
}
