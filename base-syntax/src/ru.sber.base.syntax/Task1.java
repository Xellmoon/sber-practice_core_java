package ru.sber.base.syntax;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Длина массива ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("заполните массив");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                if (array[j] > array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}
