package ru.sber.base.syntax;

public class Task6 {
    public static void main(String[] args) {
        String[][] StringArray = new String[3][5];
// заполнение массива значениями
        for (int i=0; i<StringArray.length; i++) {
            for (int j = 0; j < StringArray[i].length; j++) {
                StringArray[i][j] = "*";
            }
        }
// проверка
        for (int i=0; i<StringArray.length; i++) {
            for (int j = 0; j < StringArray[i].length; j++) {
                System.out.print(StringArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}