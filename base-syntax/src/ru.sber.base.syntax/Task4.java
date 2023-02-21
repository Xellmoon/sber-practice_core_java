package ru.sber.base.syntax;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = (float) Math.random();
        }
//        for (int i = 0; i < size; i++) {
//           System.out.println(array[i]);
//         }
        float max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Максимальный элемент:" + max);
        float average = 0;
        for (int i = 1; i < size; i++) {
            average = average + array[i];
        }
        average = average / size;
        System.out.println("Среднее значение:" + average);
    }
}
