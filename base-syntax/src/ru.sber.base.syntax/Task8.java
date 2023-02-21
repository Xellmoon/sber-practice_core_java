package ru.sber.base.syntax;

import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        String Answer = "троллейбус";
        Scanner input = new Scanner(System.in);
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {


            System.out.print("Введите ответ: ");
            String str = in.nextLine();

            if ((str.equals(Answer)) == true){
                System.out.println("Правильно!");
                return;
            } else if ((str.equals("Сдаюсь")) == true) {
                System.out.println("Правильный ответ: троллейбус");
                return;

            } else if (i < 2) {
                System.out.println("Попробуй еще");
            }


        }

    }
}
