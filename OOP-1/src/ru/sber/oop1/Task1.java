package ru.sber.oop1;

public class Task1{

    public static void main(String[] args) {

        Phone barsik = new Phone("880055535","3310", 645);
        barsik.sendMessage();
        barsik.receiveCall();
        barsik.receiveCall("POLUNKA","89765364");
        System.out.println(barsik.getNumber());

    }
}
