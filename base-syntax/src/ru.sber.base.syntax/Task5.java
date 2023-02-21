package ru.sber.base.syntax;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("2");
        for (int i = 3; i < 100; i++) {
            for(int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    break;
                }
                if (j == (i - 1)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}