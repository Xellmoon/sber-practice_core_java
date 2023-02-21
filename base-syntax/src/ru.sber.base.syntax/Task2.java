package ru.sber.base.syntax;

import java.util.Scanner;
public class Task2 {
    public static int size = 5;
    private static int[] array = new int[size];

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }

    public static void main(String[] args) {
        System.out.println("заполните массив");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int startIndex = 0;
        int endIndex = size - 1;
        doSort(startIndex, endIndex);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
