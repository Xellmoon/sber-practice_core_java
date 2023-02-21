package ru.sber.oop1;

public class Phone {
    String model, number,name;

    int weight;

    public Phone(String number, String model, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public Phone() {
    }

    public void receiveCall(){
        System.out.println("Звонит {name}");
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " по номеру " + number);
    }
    public void sendMessage() {
        String[] array = new String[5];
        array[0] = "892134935";
        array[1] = "899900077";
        array[2] = "880055535";
        array[3] = "+34322324";
        array[4] = "+81212412";
        System.out.println("Номера телефонов:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i] + " ");
        }
    }

    public String getNumber() {
        return number;
    }


}
